
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

import java.io.Serializable;
import java.util.Date;

import org.json.JSONObject;

import org.openecomp.ncomp.utils.journaling.JournalingList;
import org.openecomp.ncomp.utils.journaling.JournalingObject;

public class MetricDailyMeasurement extends JournalingObject implements Serializable {
	private static final long serialVersionUID = 6485680539666136294L;
	static {
		JournalingObject.addClassToWhiteList("org.openecomp.ncomp.core.types.metrics.*");
	}
	public JournalingList<MetricMeasurement> l;
	public MetricMeasurement last;
	public MetricMeasurement last2;
	
	public MetricDailyMeasurement(String context, JournalingObject parent) {
		super(context,parent);
	}
	public MetricMeasurement getLast() {
		return last;
	}
	public void setLast(MetricMeasurement m) {
		logAttributeValue("last",m);
		this.last = m;
	}
	public MetricMeasurement getLast2() {
		return last2;
	}
	public void setLast2(MetricMeasurement m) {
		logAttributeValue("last2",m);
		this.last2 = m;
	}


	@Override
	public void init() {
		if (l == null)
			l = new JournalingList<MetricMeasurement>("l",this);
		else
			initChild("l", l);
	}

	public void add(Date d, Double v) {
		l.add(new DoubleMetricMeasurement(d, v));
		if (last == null || d.after(last.d)) { 
			if (last != null) setLast2(last);
			setLast(new DoubleMetricMeasurement(d, v));
		}
	}
	public void add(Date d, long v) {
		l.add(new LongMetricMeasurement(d, v));
		if (last == null || d.after(last.d)) { 
			if (last != null) setLast2(last);
			setLast(new LongMetricMeasurement(d, v));
		}
	}
	public void add(Date d, String v) {
		l.add(new StringMetricMeasurement(d, v));
		if (last == null || d.after(last.d)) { 
			if (last != null) setLast2(last);
			setLast(new StringMetricMeasurement(d, v));
		}
	}
	@Override
	public JSONObject toJson() {
		JSONObject json = super.toJson();
		json.put("last", last.toString());
		json.put("last2", last.toString());
		return json ;
	}

	
}
