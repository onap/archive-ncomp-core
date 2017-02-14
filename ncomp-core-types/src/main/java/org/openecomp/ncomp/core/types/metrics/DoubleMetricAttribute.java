
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

public class DoubleMetricAttribute implements MetricAttribute {
	public static final Logger logger = Logger.getLogger(DoubleMetricAttribute.class);
	private IMetricStore store = null;
	private String path;
	public Date last;
	
	@Override
	public void setup(IMetricStore store, String path) {
		this.store = store;
		this.path = path;
	}
	public void add(Date d, double v) {
		if (store == null) 
			throw new RuntimeException("Store is not setup");
		store.addDoubleValue(path, d, v,"DoubleMetricAttribute");
	}
	public Double getValue() {
		Object o = store.getLast(path);
		if (o instanceof DoubleMetricMeasurement) {
			DoubleMetricMeasurement x = (DoubleMetricMeasurement) o;
			if (x != null) last = x.d;
			return x == null ? 0.0 : x.v;
		}
//		System.err.println("ZZZ: " + path + o);
		return -99999.0; 
	}
	public String toStringValue() {
		return Double.toString(getValue());
	}
	public List<DoubleMetricMeasurement> getValues(Date start, Date end) {
		if (store == null) 
			throw new RuntimeException("Store is not setup");
		List<DoubleMetricMeasurement> res = new ArrayList<DoubleMetricMeasurement>();
		MetricMeasurement error = null;
		for (MetricMeasurement m : store.getValues(path,start,end)) {
			if (m instanceof DoubleMetricMeasurement) {
				res.add((DoubleMetricMeasurement) m);
				continue;
			}
			error = m;
		}
		if (error != null) 
			logger.warn("Bad types for Double Metric: " + error.getClass() + " path: " + path);
		return res; 
	}
	@Override
	public List<DoubleMetricMeasurement> getValuesDouble(Date start, Date end) {
		return getValues(start, end);
	}
	Double currentValue = null;
	public void setValue(double v, boolean force) {
		if (force) {
			if (store == null) {
				logger.warn("Store is not setup");
				return;
			}
			store.addDoubleValue(path, new Date(), v, "DoubleMetricAttribute");
			store.save(30000);
		}
		else {
			currentValue += v;
		}
	}	
	@Override
	public void record() {
		if (currentValue  != null) {
			setValue(currentValue.doubleValue(), true);
//			System.err.println("XYZ record " + path + " " + incrementalValue);
			currentValue = null;
		}
	}
}
