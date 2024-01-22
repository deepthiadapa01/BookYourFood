package com.business.vendor.service;

import java.util.List;

import com.business.vendor.dto.ProductsDto;
import com.business.vendor.dto.ProductsListDto;
import com.business.vendor.entity.Products;

public interface IProductService {
	
	public ProductsDto createProduct(ProductsDto productDto);
	
	public ProductsListDto findProducts(String productName,int shopId);
	
	
	public ProductsListDto findAllProducts(int shopId);
	
}
