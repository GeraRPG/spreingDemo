package com.sayuri.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sayuri.demo.entity.Product;

public interface ProductsDao extends JpaRepository<Product, Long>{
	
}
