package com.nicovivas.unit.controllers;

import com.nicovivas.controllers.DemoController;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class DemoControllerTest {

    @Inject
    DemoController demoController;

    @Test
    void pingTest() {
        // Given

        // When
        String response = demoController.ping();
        // Then
        Assertions.assertEquals("pong", response);
    }
}
