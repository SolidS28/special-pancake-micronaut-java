package com.nicovivas.models;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;
import lombok.NoArgsConstructor;

@Introspected
@NoArgsConstructor
@Data
public class RandomFact {

    private String id;
    private String text;
}
