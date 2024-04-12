package com.samueltorga.reactive.repository.entity;

import io.micronaut.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Table(name = "events")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Event {

    @Id
    private Integer id;
    private String name;
}
