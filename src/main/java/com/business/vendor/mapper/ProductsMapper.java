package com.business.vendor.mapper;

import org.springframework.stereotype.Component;

import com.business.vendor.dto.ProductsDto;
import com.business.vendor.entity.Products;



public class ProductsMapper {
	
	public ProductsDto productsToProductsDto(Products product) {
		ProductsDto productDto=new ProductsDto();
		productDto.setShopId(product.getShopId());
		productDto.setProductWeight(product.getProductWeight());
		productDto.setProductType(product.getProductType());
		productDto.setProductName(product.getProductName());
		productDto.setProductCost(product.getProductCost());
		productDto.setPreparation_time(product.getPreparation_time());
		productDto.setOfferDetails(product.getOfferDetails());
		productDto.setFoodVariety(product.getFoodVariety());
		productDto.setFoodRatings(product.getFoodRatings());
		productDto.setAvailability(product.getAvailability());
		productDto.setShopName(product.getShopName());
		return productDto;
	}
	
	
	public Products productsDtoToProducts(ProductsDto productDto) {
		Products product=new Products();
		product.setShopId(productDto.getShopId());
		product.setProductWeight(productDto.getProductWeight());
		product.setProductType(productDto.getProductType());
		product.setProductName(productDto.getProductName());
		product.setProductCost(productDto.getProductCost());
		product.setPreparation_time(productDto.getPreparation_time());
		product.setOfferDetails(productDto.getOfferDetails());
		product.setFoodVariety(productDto.getFoodVariety());
		product.setFoodRatings(productDto.getFoodRatings());
		product.setAvailability(productDto.getAvailability());
		product.setShopName(productDto.getShopName());

		return product;
	}
	
	
	

}
