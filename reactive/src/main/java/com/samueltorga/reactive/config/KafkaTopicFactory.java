package com.samueltorga.reactive.config;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.CreateTopicsOptions;
import org.apache.kafka.clients.admin.NewTopic;

import java.util.Optional;

@Requires(bean = AdminClient.class)
@Factory
@RequiredArgsConstructor
public class KafkaTopicFactory {

    @Bean
    CreateTopicsOptions options() {
        return new CreateTopicsOptions()
                .timeoutMs(null).validateOnly(false).retryOnQuotaViolation(false);
    }

    @Bean
    NewTopic easyCollectorEventsNewTopic() {
        return new NewTopic("EASYCOLLECTOR-EVENTS", Optional.of(6), Optional.of((short) 3));
    }

}
