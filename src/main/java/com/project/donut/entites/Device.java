package com.project.donut.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Device implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deviceID;
	
	@ManyToOne
	@JoinColumn
	private Productionline productionline;
	
	@Enumerated(EnumType.STRING)
	private State state;
	
}
