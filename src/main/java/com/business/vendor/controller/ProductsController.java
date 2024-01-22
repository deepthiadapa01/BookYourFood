package com.business.vendor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.business.vendor.dto.ProductsDto;
import com.business.vendor.dto.ProductsListDto;
import com.business.vendor.exceptions.DuplicateRecordException;
import com.business.vendor.service.IProductService;

@RestController
@RequestMapping("productManuplations")
public class ProductsController {

	@Autowired
	IProductService productService;

	@GetMapping("/")
	public ResponseEntity<String> helloProduct() {
		return ResponseEntity.status(HttpStatus.OK).body("Hello in product Manuplations.");
	}

	@PostMapping("/createproducts")
	public ResponseEntity<ProductsDto> createProduct(@RequestBody ProductsDto productsDto) {
		String productName = productsDto.getProductName();
		int shopId = productsDto.getShopId();
		ProductsListDto findProducts = productService.findProducts(productName, shopId);
		int size = findProducts.getProductDtoList().size();
		if (size == 0) {
			productService.createProduct(productsDto);
			return ResponseEntity.status(HttpStatus.CREATED).body(productsDto);
		} else {
			throw new DuplicateRecordException("You already created this product");
		}
	}

	@GetMapping("/fetchproducts")
	public ResponseEntity<ProductsListDto> fetchProducts(@RequestParam("productName") String productName,
			@RequestParam("shopId") int shopId) {

		ProductsListDto products = productService.findProducts(productName, shopId);

		return ResponseEntity.status(HttpStatus.OK).body(products);
	}

	@GetMapping("/fetchall")
	public ResponseEntity<ProductsListDto> fetchAllProducts(@RequestParam("shopId") int shopId) {

		ProductsListDto products = productService.findAllProducts(shopId);

		return ResponseEntity.status(HttpStatus.OK).body(products);
	}

	 @PatchMapping("/updateproducts")
	public ResponseEntity<ProductsDto> updateProducts(@RequestBody ProductsDto productDto){
		 //ProductsDto product
		 
		 return ResponseEntity.status(HttpStatus.OK).body(productDto);
		 
	 }


}
