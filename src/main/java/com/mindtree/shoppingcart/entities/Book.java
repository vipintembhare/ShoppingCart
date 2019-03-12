package com.mindtree.shoppingcart.entities;

import lombok.Data;

@Data
public class Book extends Product{
	private String genre;
	private String author;
	private String publication;

}
