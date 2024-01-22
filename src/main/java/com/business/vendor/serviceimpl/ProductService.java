package com.business.vendor.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.vendor.dto.ProductsDto;
import com.business.vendor.dto.ProductsListDto;
import com.business.vendor.entity.Products;
import com.business.vendor.mapper.ProductsMapper;
import com.business.vendor.repo.ProductRepo;
import com.business.vendor.service.IProductService;


@Service
public class ProductService implements IProductService{
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public ProductsDto createProduct(ProductsDto productDto) {
		// TODO Auto-generated method stub
		ProductsMapper productMapper=new ProductsMapper();
		Products product = productMapper.productsDtoToProducts(productDto);
		productRepo.save(product);
		
		return productDto;
	}

	@Override
	public ProductsListDto findProducts(String productName,int shopId) {
		// TODO Auto-generated method stub
		List<Products> products = productRepo.findByProductNameAndShopIdOrderByProductName(productName,shopId);
		ProductsMapper productMapper=new ProductsMapper();
		ProductsListDto productsListDto=new ProductsListDto();
		List<ProductsDto> collect = products.stream()
	                .map(product -> productMapper.productsToProductsDto(product))
	                .collect(Collectors.toList());

		productsListDto.setProductDtoList(collect);
		return productsListDto;
		
		
	}

	@Override
	public ProductsListDto findAllProducts(int shopId) {
		List<Products> products = productRepo.findByShopId(shopId);
		ProductsMapper productMapper=new ProductsMapper();
		ProductsListDto productsListDto=new ProductsListDto();
		List<ProductsDto> collect = products.stream()
	                .map(product -> productMapper.productsToProductsDto(product))
	                .collect(Collectors.toList());
		productsListDto.setProductDtoList(collect);
		return productsListDto;
	}

	
	
	}


