package com.project.donut.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.donut.entites.TestProduct;

@RepositoryRestResource
public interface TestProductRepository extends JpaRepository<TestProduct, Long>{}
