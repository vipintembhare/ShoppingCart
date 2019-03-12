package com.mindtree.shoppingcart.entities;

import lombok.Data;

@Data
public class Cart {
	private String cartId;
	private String name;
	private float total;
}
