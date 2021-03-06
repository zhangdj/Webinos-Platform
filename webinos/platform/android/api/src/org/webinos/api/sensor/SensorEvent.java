/*******************************************************************************
*  Code contributed to the webinos project
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*  
*     http://www.apache.org/licenses/LICENSE-2.0
*  
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* 
* Copyright 2012 Sony Mobile Communications
* 
******************************************************************************/

package org.webinos.api.sensor;

import org.meshpoint.anode.idl.Dictionary;

public class SensorEvent implements Dictionary {
	public static final int SENSOR_STATUS_ACCURACY_HIGH = 4;
	public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 3;
	public static final int SENSOR_STATUS_ACCURACY_LOW = 2;
	public static final int SENSOR_STATUS_UNRELIABLE = 1;
	public static final int SENSOR_STATUS_UNAVAILABLE = 0;
	
	public String sensorType;
	public String sensorId;
	public int accuracy;
	public int rate;
	public boolean interrupt;
	public double[] sensorValues;
}
