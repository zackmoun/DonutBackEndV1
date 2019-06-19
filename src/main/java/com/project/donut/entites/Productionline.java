package com.project.donut.entites;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Productionline implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lineID;
	private String lineName;
	
	@OneToMany(mappedBy = "productionline", cascade = CascadeType.ALL)
	private Set<Storage> storages;
	
	@OneToMany(mappedBy = "productionline", cascade = CascadeType.ALL)
	private Set<Device> devices;
}
