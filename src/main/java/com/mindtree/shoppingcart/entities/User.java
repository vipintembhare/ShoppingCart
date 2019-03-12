package com.mindtree.shoppingcart.entities;

import java.util.List;

import lombok.Data;

@Data
public class User {

	private int userId;
	private List<Product> products;
	private float order;
}
