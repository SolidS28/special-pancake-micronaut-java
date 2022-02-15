package com.nicovivas.controllers;

import com.nicovivas.models.RandomResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/random")
public interface RandomController {
    /**
     * Generates a random response merging different sources
     * @return Random facts
     */
    @GetMapping("/surprise")
    RandomResponse getRandomness();
}
