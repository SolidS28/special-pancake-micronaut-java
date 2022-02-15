package com.nicovivas.controllers;

import jakarta.inject.Singleton;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Singleton
@RestController
@NoArgsConstructor
public class DemoControllerImpl implements DemoController {

    @Override
    public String ping() {
        return "pong";
    }
}
