package com.project.donut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.donut.dao.ProductRepository;
import com.project.donut.entites.Product;

@RestController
public class ProductRestServices {
	
	@Autowired
	private ProductRepository productRepository; 
	
	@GetMapping(value = "/listProducts")
	public List<Product> listProducts(){		
		return productRepository.findAll();
	}
	
	@GetMapping(value="/listProducts/{id}")
	public Product listProducts(@PathVariable(name = "id") Long id){		
		return productRepository.findById(id).get();
	}
	
	@PutMapping(value="/listProducts/{id}")
	public Product update(@PathVariable(name = "id") Long id, @RequestBody Product p){
		p.setProductID(id);
		return productRepository.save(p);
	}
	
//	@PostMapping(value="/listProducts/")
//	public Product save(@RequestBody Product p){
//		return productRepository.save(p);
//	}
	
	@PostMapping(value="/listProducts/")
	public void  delete(@PathVariable(name = "id") Long id){
		productRepository.deleteById(id);
	}


}
