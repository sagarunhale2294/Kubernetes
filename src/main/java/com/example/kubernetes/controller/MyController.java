package com.example.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/v1/myapp")
public class MyController {

    @GetMapping("/hello")
    public Mono<String> helloApp() {
        System.out.println("hello I am in a controller....");
        return Mono.just("Hello");
    }
}
