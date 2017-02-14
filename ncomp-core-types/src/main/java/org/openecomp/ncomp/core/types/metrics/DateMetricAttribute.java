
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

public class DateMetricAttribute implements MetricAttribute {
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
		store.addLongValue(path, d, v, "DateMetricAttribute",false);
	}
	public Long getValue() {
		LongMetricMeasurement m = (LongMetricMeasurement) store.getLast(path);
		if (m != null) last = m.d;
		return m == null ? null : m.v;
	}
	public String toStringValue() {
		return Long.toString(getValue());
	}

	public List<LongMetricMeasurement> getValues(Date start, Date end) {
		if (store == null) 
			throw new RuntimeException("Store is not setup");
		List<LongMetricMeasurement> res = new ArrayList<LongMetricMeasurement>();
		for (MetricMeasurement m : store.getValues(path,start,end)) res.add((LongMetricMeasurement) m);
		return res;
	}
	public List<DoubleMetricMeasurement> getValuesDouble(Date start, Date end) {
		List<DoubleMetricMeasurement> res = new ArrayList<DoubleMetricMeasurement>();
		for (LongMetricMeasurement l : getValues(start, end)) {
			res.add(new DoubleMetricMeasurement(l.d, l.v)); 
		}
		return res;
	}
	@Override
	public void record() {
		// TODO Auto-generated method stub
		
	}
}
