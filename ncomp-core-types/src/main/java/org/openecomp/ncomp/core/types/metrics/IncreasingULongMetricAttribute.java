
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.ncomp.core.types.metrics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class IncreasingULongMetricAttribute implements MetricAttribute {
	public static final Logger logger = Logger.getLogger(IncreasingULongMetricAttribute.class);
	private IMetricStore store = null;
	private String path;
	public Date last;
	
	@Override
	public void setup(IMetricStore store, String path) {
		this.store = store;
		this.path = path;
	}
	public void add(Date d, long v) {
		if (store == null) 
			throw new RuntimeException("Store is not setup");
		store.addLongValue(path, d, v, "IncreasingULongMetricAttribute",false);
	}
	public Double getValue() {
		LongMetricMeasurement m1 = (LongMetricMeasurement) store.getLast(path);
		LongMetricMeasurement m2 = (LongMetricMeasurement) store.getLast2(path);
		if (m1 != null) last = m1.d;
		return m2 == null ? null : 1000.0*(m1.v-m2.v)/(m1.d.getTime() - m2.d.getTime());
	}
	public String toStringValue() {
		return Double.toString(getValue());
	}

	public List<DoubleMetricMeasurement> getValues(Date start, Date end) {
		if (store == null) 
			throw new RuntimeException("Store is not setup");
		List<DoubleMetricMeasurement> res = new ArrayList<DoubleMetricMeasurement>();
		LongMetricMeasurement prev = null;
		// need to  worry about the case that 2 values have the same timestamp
		for (MetricMeasurement m : removeDublicateTime(store.getValues(path,start,end))) {
			LongMetricMeasurement mm = (LongMetricMeasurement) m;
			if (prev != null) {
				double delta = 1000.0*(mm.v - prev.v)/(mm.d.getTime() - prev.d.getTime()) ;
				if (delta < 0) {
					logger.warn("negative value: " + delta + " mm=" + mm + " prev=" + prev);
				}
				else {
					DoubleMetricMeasurement mmm = new DoubleMetricMeasurement(mm.d, delta);
					res.add(mmm);
				}
			}
			prev = mm;
		}
		return res;

	}
	private List<MetricMeasurement>  removeDublicateTime(List<MetricMeasurement> values) {
		List<MetricMeasurement> res = new ArrayList<MetricMeasurement>();
		MetricMeasurement p = null;
		for (MetricMeasurement m : values) {
			if (p != null && p.d.getTime() != m.d.getTime()) res.add(p);
			p = m;
		}
		if (p != null) res.add(p);
		return res ;
	}
	public List<LongMetricMeasurement> getDeltaValues(Date start, Date end) {
		if (store == null) 
			throw new RuntimeException("Store is not setup");
		List<LongMetricMeasurement> res = new ArrayList<LongMetricMeasurement>();
		LongMetricMeasurement prev = null;
		for (MetricMeasurement m : store.getValues(path,start,end)) {
			LongMetricMeasurement mm = (LongMetricMeasurement) m;
			if (prev != null) {
				long delta = mm.v - prev.v ;
				LongMetricMeasurement mmm = new LongMetricMeasurement(mm.d, delta);
				res.add(mmm);
			}
			prev = mm;
		}
		return res;
	}
	@Override
	public List<DoubleMetricMeasurement> getValuesDouble(Date start, Date end) {
		return getValues(start, end);
	}
	long incrementalValue = 0;
	public void increase(long v, boolean force) {
		if (force) {
			if (store == null) {
				logger.warn("Store is not setup");
				return;
			}
			store.addLongValue(path, new Date(), v, "IncreasingULongMetricAttribute",true);
			store.save(30000);
		}
		else {
			incrementalValue += v;
		}
		
	}
	@Override
	public synchronized void record() {
		// TODO this should be thought about more.
		if (incrementalValue > 0) {
			increase(incrementalValue, true);
//			System.err.println("XYZ record " + path + " " + incrementalValue);
			incrementalValue = 0;
		}
	}
}
