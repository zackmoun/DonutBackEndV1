package com.project.donut;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.project.donut.dao.EventRepository;
import com.project.donut.dao.ProductRepository;
import com.project.donut.dao.TestProductRepository;
import com.project.donut.entites.Device;
import com.project.donut.entites.Event;
import com.project.donut.entites.InventoryProduct;
import com.project.donut.entites.Product;
import com.project.donut.entites.Productionline;
import com.project.donut.entites.Storage;
import com.project.donut.entites.TestProduct;

@SpringBootApplication
public class DonutBackEndApplication implements CommandLineRunner{

//	@Autowired
//	ProductRepository productRepository;
//	
	@Autowired
	EventRepository enEventRepository;
	
	@Autowired
	TestProductRepository testProductRepository;
	
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(DonutBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	//productRepository.save(new Product(null, "Product 1", ));
	//enEventRepository.save(new Event(null, new Date(), 10, new Product(), new Device(),'i'));
		
//		testProductRepository.save(new TestProduct(null, "Product 1"));
//		testProductRepository.save(new TestProduct(null, "Product 2"));
//		testProductRepository.save(new TestProduct(null, "Product 3"));
//		testProductRepository.save(new TestProduct(null, "Product 4"));
		
		repositoryRestConfiguration.exposeIdsFor(Device.class);
		repositoryRestConfiguration.exposeIdsFor(Event.class);
		repositoryRestConfiguration.exposeIdsFor(InventoryProduct.class);
		repositoryRestConfiguration.exposeIdsFor(Product.class);
		repositoryRestConfiguration.exposeIdsFor(Productionline.class);
		repositoryRestConfiguration.exposeIdsFor(Storage.class);
		
		testProductRepository.findAll().forEach(p -> {
			System.out.println(p.toString());
		});
		
		
		
	}

}
