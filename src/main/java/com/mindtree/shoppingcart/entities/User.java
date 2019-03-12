package com.mindtree.shoppingcart.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	private int userId;
	@OneToOne
	private Cart cart;
}
