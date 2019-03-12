package com.mindtree.shoppingcart.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Cart {
	@Id
	private String cartId;
	private String name;
	private float total;
	@OneToMany
	private Set<Product> products;
}
