package com.nicovivas.integration;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@MicronautTest
public class DemoEndpointsTest {
    @Inject
    private EmbeddedServer server;

    @Inject
    private ApplicationContext context;

    private HttpClient client;

    @BeforeEach
    void setup() {
        client = HttpClient.create(server.getURL());
    }

    @Test
    void testPing() {
        // Given
        HttpRequest req = HttpRequest.GET("/ping");
        // When
        HttpResponse response = client.toBlocking().exchange(req);
        // Then
        Assertions.assertEquals(HttpStatus.OK, response.getStatus());
    }
}
