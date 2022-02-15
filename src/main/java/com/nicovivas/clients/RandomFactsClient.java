package com.nicovivas.clients;

import com.nicovivas.models.RandomFact;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Singleton;
import org.reactivestreams.Publisher;

@Singleton
@Client("https://uselessfacts.jsph.pl")
public interface RandomFactsClient {
    @Get("/random.json")
    Publisher<RandomFact> fetchReleases();
}
