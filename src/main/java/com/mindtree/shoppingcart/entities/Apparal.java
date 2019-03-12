package com.mindtree.shoppingcart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@DiscriminatorValue("2")
public class Apparal extends Product{
	private String type;
	private String brand;
	private String design;

}
