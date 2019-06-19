package com.project.donut.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InventoryProduct implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "storageID")
    Storage storage;
 
    @ManyToOne
    @JoinColumn(name = "productID")
    Product product;
    
    private Integer totalQty;
    private Integer availableQty;
    private Integer blockedQty;
	
}
