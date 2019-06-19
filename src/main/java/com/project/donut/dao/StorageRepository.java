package com.project.donut.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.project.donut.entites.Storage;

@RepositoryRestResource
public interface StorageRepository extends JpaRepository<Storage, Long>{}
