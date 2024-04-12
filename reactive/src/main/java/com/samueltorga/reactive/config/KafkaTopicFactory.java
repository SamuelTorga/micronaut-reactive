package com.samueltorga.reactive.config;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.CreateTopicsOptions;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class KafkaTopicFactory {

    @Bean
    CreateTopicsOptions options() {
        return new CreateTopicsOptions()
                .timeoutMs(5000).validateOnly(true).retryOnQuotaViolation(false);
    }

    @Bean
    NewTopic topic1() {
        return new NewTopic("EASYCOLLECTOR-EVENTS", 3, (short) 1);
    }

}
