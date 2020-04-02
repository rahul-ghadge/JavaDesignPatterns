package com.design.pattern.builder.impl;

import java.io.Serializable;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class Errors implements Serializable {

	private static final long serialVersionUID = 1L;
	
//	@JsonProperty
	private int errorCode;
//	@JsonProperty
	private String errorMessage;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "Errors [errorCode=" + errorCode + ", errorMessage="
				+ errorMessage + "]";
	}
	
}
