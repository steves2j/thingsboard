/**
 * Copyright © 2016-2018 The Thingsboard Authors
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
 */
package org.thingsboard.server.service.telemetry;

public class AttributeData implements Comparable<AttributeData>{

    private final long lastUpdateTs;
    private final String key;
    private final Object value;
    private final boolean inherited;

    public AttributeData(long lastUpdateTs, String key, Object value,boolean inherited) {
        super();
        this.lastUpdateTs = lastUpdateTs;
        this.key = key;
        this.value = value;
        this.inherited = inherited;
    }

    public long getLastUpdateTs() {
        return lastUpdateTs;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
    public boolean isInherited() {
    	return inherited;
    }

    @Override
    public int compareTo(AttributeData o) {
        return Long.compare(lastUpdateTs, o.lastUpdateTs);
    }

}
