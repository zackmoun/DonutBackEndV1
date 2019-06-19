package com.project.donut.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class TestProduct implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	
	public TestProduct() {}
	
	public TestProduct(Long id, String productName) {
		this.id = id;
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "ID:" +id+ "Product Name:" +productName;
	}

}
