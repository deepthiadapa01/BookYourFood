package com.business.vendor.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", nullable=false)
	private int productId;

	@Column(name = "shop_id")
	private int shopId;

	@Column(name = "product_name", nullable = false)
	private String productName;

	@Column(name = "product_cost", nullable = false, precision = 10, scale = 2)
	private int productCost;

	@Column(name = "product_weight", precision = 8, scale = 2, nullable=false)
	private Double productWeight;

	@Column(name = "product_type", length = 50, nullable=false)
	private String productType;
	
	
	@Column(name="preparation_time",nullable=false)
	private Time preparation_time;

	@Column(name = "shop_name", length = 15, nullable=false)
	private String shopName;
	
	@Column(name = "food_ratings",  nullable=false)
	private int foodRatings;
	
	@Column(name = "offer_details")
	private int offerDetails;
	
	@Column(name = "food_variety", length = 17, nullable=false)
	private String foodVariety;
	
	@Column(name = "availability")
	private Boolean availability;
	
	
	/*
	 * 
	 product_id	int	NO	PRI		
shop_id	int	YES			
product_name	varchar(255)	NO			
product_cost	decimal(10,2)	NO			
product_weight	decimal(8,2)	YES			
product_type	varchar(50)	YES			
preparation_time	time	NO		00:00:00	
shop_name	varchar(15)	YES			
food_ratings	int	YES			
offer_details	int	YES			
food_variety	varchar(10)	YES			
availability	tinyint(1)	YES			
	 * 
	 * 
	 * 
	 */

}
