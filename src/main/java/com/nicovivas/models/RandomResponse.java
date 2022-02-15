package com.nicovivas.models;

import lombok.Builder;
import lombok.Data;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

@Data
@Builder
public class RandomResponse {
    @Required
    private String randomFact;
}
