package com.nicovivas.controllers;

import jakarta.inject.Singleton;
import org.springframework.web.bind.annotation.RestController;

@Singleton
@RestController
public class DemoControllerImpl implements DemoController {

    @Override
    public String ping() {
        return "pong";
    }
}
