package com.samueltorga.reactive.controller.messages;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.reactor.http.client.ReactorHttpClient;
import io.micronaut.serde.annotation.SerdeImport;
import jakarta.inject.Inject;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class EasyCollectorEventsConsumer {

    @Inject
    private final ReactorHttpClient httpClient;

    @Topic("EASYCOLLECTOR-EVENTS")
    void receive(String event) {
        log.info("Event Received: {}", event);
//        MutableHttpRequest<EventCreate> request = HttpRequest.POST(URI.create("http://localhost:8081/event"), EventCreate.builder()
//                .event(event)
//                .build());
//        return httpClient.exchange(request);
    }

    @Data
    @Builder
    @Introspected
    @SerdeImport(EventCreate.class)
    public static class EventCreate {

        private String event;

    }

}
