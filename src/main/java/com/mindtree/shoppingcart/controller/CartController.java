package com.mindtree.shoppingcart.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mindtree.shoppingcart.entities.Product;
import com.mindtree.shoppingcart.services.ProductServices;



@RestController
public class CartController {

	@Autowired ProductServices productService;
	private final static Gson gson = new Gson();
	private Logger logger = LoggerFactory.getLogger(CartController.class);
	
	/**
	 * Adds Product in DB
	 * @param product
	 * @return
	 */
	@PostMapping(value="/addProduct",consumes="Application/Json" )
	public Product addProduct(@RequestBody Product product) {
		logger.info("Adding product");
		//Product aProduct =gson.fromJson(product, Product.class);
		productService.save(product);
		logger.info("Product added successfully");
		return product;
	}
	
	/**
	 * lists all the products
	 * @return
	 */
	
	@GetMapping(value="/listAllProducts" )
	public List<Product> getAllProducts() {
		return productService.findAllProducts();
	}
}
