package com.samueltorga.reactive.controller;

import com.samueltorga.reactive.controller.dto.EventCreate;
import com.samueltorga.reactive.repository.EventRepository;
import com.samueltorga.reactive.repository.entity.Event;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Controller("event")
@RequiredArgsConstructor
public class EventController {

    private final EventRepository eventRepository;

    @Post
    public Mono<HttpResponse<Mono<Event>>> createEvent(@Body EventCreate eventCreate) {
        return Mono.just(HttpResponse.created(eventRepository.save(Event.builder()
                .name(eventCreate.getEvent())
                .build())));
    }

}
