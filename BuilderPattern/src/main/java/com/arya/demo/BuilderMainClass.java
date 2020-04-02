package com.arya.demo;

import java.util.Arrays;
import java.util.List;

import com.arya.demo.builder.Error;
import com.arya.demo.builder.Error.SEVERITY;
import com.arya.demo.builder.Payload;
import com.arya.demo.builder.ResponseTemplate;
import com.arya.demo.builder.Status;
import com.arya.demo.builder.Error.ERROR_TYPE;
import com.arya.demo.builder.Response;

public class BuilderMainClass {

	public static void main(String[] args) {
		
		// Some static dummy data
		List<String> statusList = Arrays.asList("NEW", "IN-PROGRESS", "PENDING", "COMPLETED", "REJECTED");

		
		// Using ResponseTemplate class
		//System.out.println("Success Response Template :: " + ResponseTemplate.success(statusList));
		System.out.println("================================================================");
		
		System.out.println("Error Response Template :: " + ResponseTemplate.error(STATUS.BAD_REQUEST.toCode(), STATUS.BAD_REQUEST.name()));
		System.out.println("================================================================");
		
		
		

		
		/*
		 * Build Success response using Response.Builder class
		 */
		Response.Builder successResponseBuilder = new Response.Builder();

		
		successResponseBuilder.payload(new Payload<>(statusList));
		successResponseBuilder.status(
				new Status.Builder()
				.setStatusCode(STATUS.SUCCESS.toCode())
				.statusValue(STATUS.SUCCESS.name())
				.build());
		
		System.out.println("Success Response :: " + successResponseBuilder.build());
		
		System.out.println("================================================================");

		
		
		
		
		
		
		
		try {

			int num = 0/0;
			System.out.println("Above line throws exception : " + num);

		} catch (Exception e) {
			
			/*
			 * Build Failure response using Response.Builder class
			 */
			Response.Builder failedResponseBuilder = new Response.Builder();
			
			failedResponseBuilder.error(
					new Error.Builder()
					.errorCode(STATUS.BAD_REQUEST.toCode())
					.message(e.getLocalizedMessage())
					.errorType(ERROR_TYPE.BUSINESS.toValue())
					.fieldName("First Status: NEW")
					.level(SEVERITY.MEDIUM.name())
					.build());
			
			failedResponseBuilder.status(
					new Status.Builder()
					.setStatusCode(STATUS.BAD_REQUEST.toCode())
					.statusValue(String.valueOf(STATUS.BAD_REQUEST.toCode()))
					.build());
			
			System.out.println("Error Response :: " + failedResponseBuilder.build());
			
			System.out.println("================================================================");
		}
	}
}



// Dummy status. Use your own status for response
enum STATUS {
	
	SUCCESS(200), BAD_REQUEST(400), NOT_FOUND_CODE(404);

	private int statusCode;

	private STATUS(final int statusCode) {
		this.statusCode = statusCode;
	}

	public int toCode() {
		return statusCode;
	}
}
