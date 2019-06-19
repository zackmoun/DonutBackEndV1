package com.project.donut.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.project.donut.entites.Event;

@RepositoryRestResource
public interface EventRepository extends JpaRepository<Event, Long>{}
