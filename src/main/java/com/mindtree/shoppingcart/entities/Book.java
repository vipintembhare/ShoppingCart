package com.mindtree.shoppingcart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@DiscriminatorValue("1")
public class Book extends Product{
	private String genre;
	private String author;
	private String publication;

}
