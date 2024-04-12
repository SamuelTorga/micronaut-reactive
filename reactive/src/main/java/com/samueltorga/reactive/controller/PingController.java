package com.samueltorga.reactive.controller;

import com.samueltorga.reactive.controller.messages.EasyCollectorEventProducer;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Controller("ping")
@RequiredArgsConstructor
public class PingController {

    private final EasyCollectorEventProducer easyCollectorEventProducer;

    @Get(produces = {"text/plain"})
    public Mono<HttpResponse<String>> index() {
        easyCollectorEventProducer.sendEvent("TEST");
        return Mono.just(HttpResponse.ok(LocalDateTime.now().toString()));
    }
}
