package com.samueltorga.reactive.controller.dto;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.SerdeImport;
import lombok.Data;

@Data
@Introspected
@SerdeImport(EventCreate.class)
public class EventCreate {

    private String event;

}
