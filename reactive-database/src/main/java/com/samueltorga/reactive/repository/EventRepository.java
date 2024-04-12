package com.samueltorga.reactive.repository;

import com.samueltorga.reactive.repository.entity.Event;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.r2dbc.annotation.R2dbcRepository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

@R2dbcRepository(dialect = Dialect.MYSQL)
public interface EventRepository extends ReactorCrudRepository<Event, Integer> {
}
