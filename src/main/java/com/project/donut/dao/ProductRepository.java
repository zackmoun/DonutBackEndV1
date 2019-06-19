package com.project.donut.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.donut.entites.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {}
