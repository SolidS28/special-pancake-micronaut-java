package com.nicovivas.controllers;

import com.nicovivas.clients.RandomFactsClient;
import com.nicovivas.models.RandomFact;
import com.nicovivas.models.RandomResponse;
import com.nicovivas.services.RandomService;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Singleton
@RestController
@AllArgsConstructor
public class RandomControllerImpl implements RandomController {

    private final RandomService randomService;

    @Override
    public RandomResponse getRandomness() {
        return randomService.getRandomness();
    }
}
