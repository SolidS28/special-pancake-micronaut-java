package com.nicovivas.services;

import com.nicovivas.clients.RandomFactsClient;
import com.nicovivas.controllers.RandomController;
import com.nicovivas.models.RandomFact;
import com.nicovivas.models.RandomResponse;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Singleton
@Service
@AllArgsConstructor
public class RandomServiceImpl implements RandomService {

    private final RandomFactsClient randomFactsClient;

    @Override
    public RandomResponse getRandomness() {
        Mono<RandomFact> randomFactMono = Mono.from(randomFactsClient.fetchReleases());
        String randomFact = randomFactMono.block().getText();
        return RandomResponse.builder().randomFact(randomFact).build();
    }
}