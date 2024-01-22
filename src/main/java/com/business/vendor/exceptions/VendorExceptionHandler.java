package com.business.vendor.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class VendorExceptionHandler {
	
	
	@ExceptionHandler(DuplicateRecordException.class)
	public ResponseEntity<VendorExceptions> handleDuplicateRecordException(DuplicateRecordException duplicateRecord) {
		
		VendorExceptions vendorException=new VendorExceptions(HttpStatus.BAD_REQUEST,duplicateRecord.getMessage());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(vendorException);
	}

}
