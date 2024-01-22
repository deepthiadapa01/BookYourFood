package com.business.vendor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.business.vendor.entity.Products;


@Repository
public interface ProductRepo extends JpaRepository<Products, Long> {
	
	public List<Products> findByProductNameAndShopIdOrderByProductName(String productName, int shopId);
	
	public List<Products> findByShopId(int shopId);
	

}
