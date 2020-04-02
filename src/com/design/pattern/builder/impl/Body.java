package com.design.pattern.builder.impl;

import java.io.Serializable;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class Body<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@JsonProperty
	private T payload;

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "Body [payload=" + payload + "]";
	}
}
