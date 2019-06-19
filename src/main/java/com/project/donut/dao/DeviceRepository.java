package com.project.donut.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.project.donut.entites.Device;

@RepositoryRestResource
public interface DeviceRepository extends JpaRepository<Device, Long>{}
