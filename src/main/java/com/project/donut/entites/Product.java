package com.project.donut.entites;

import java.io.Serializable;
import java.util.Set;

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
public class Product implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productID;
	private String productName;
	
	@OneToMany(mappedBy = "product")
    Set<InventoryProduct> inventoryProduct;

	public Product() {}
		
	public Product(Long productID, String productName) {
		this.productID = productID;
		this.productName = productName;
	}

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Set<InventoryProduct> getInventoryProduct() {
		return inventoryProduct;
	}

	public void setInventoryProduct(Set<InventoryProduct> inventoryProduct) {
		this.inventoryProduct = inventoryProduct;
	}
	
	
	
}
