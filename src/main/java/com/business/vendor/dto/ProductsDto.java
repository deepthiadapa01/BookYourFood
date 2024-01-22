package com.business.vendor.dto;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDto {

	public int productId;
	
	//@JsonIgnore
	public int shopId;

	public String productName;

	public int productCost;

	public Double productWeight;

	public String productType;

	public Time preparation_time;

	//@JsonIgnore
	public String shopName;

	public int foodRatings;

	public int offerDetails;

	public String foodVariety;

	public Boolean availability;
	
	public String imageURL;
	

}
