package com.mindtree.shoppingcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.shoppingcart.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
