package com.business.vendor.exceptions;

import org.springframework.http.HttpStatusCode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendorExceptions {
	
	public HttpStatusCode httpCode;
	
	public String message;
	 

}
