/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.rhq.plugin.model;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * SwitchYard Throttling
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Throttling {
    private final Boolean enabled;
    private final Integer maxRequests;
    private final Long timePeriod;
    
    @JsonCreator
    public Throttling(@JsonProperty("enabled") Boolean enabled,
            @JsonProperty("maxRequests") Integer maxRequests,
            @JsonProperty("timePeriod") Long timePeriod) {
        this.enabled = enabled;
        this.maxRequests = maxRequests;
        this.timePeriod = timePeriod;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public Integer getMaxRequests() {
        return maxRequests;
    }

    public Long getTimePeriod() {
        return timePeriod;
    }
}
