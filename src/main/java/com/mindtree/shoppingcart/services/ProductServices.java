package com.mindtree.shoppingcart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.shoppingcart.entities.Product;
import com.mindtree.shoppingcart.repositories.ProductRepository;

@Service
public class ProductServices {

	@Autowired ProductRepository productRepo;
	
	/**
	 * Saves product
	 * @param product
	 */
	public void save(Product product) {
		productRepo.save(product);
	}
	
	/**
	 * Finds the product with id
	 * @param id
	 * @return
	 */
	public Product findById(int id) {
		return productRepo.findById(id).orElse(null);
	}
	
	/**
	 * Finds all the product
	 * @return
	 */
	public List<Product> findAllProducts(){
		return productRepo.findAll();
	}
}

