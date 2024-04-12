package com.samueltorga.reactive.config;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.discovery.event.ServiceReadyEvent;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Singleton
@Slf4j
public class CreateTopicOnStartupConfig implements ApplicationEventListener<ServiceReadyEvent> {
    @Override
    public void onApplicationEvent(ServiceReadyEvent event) {
        log.info("ApplicationStarted");
    }
}
