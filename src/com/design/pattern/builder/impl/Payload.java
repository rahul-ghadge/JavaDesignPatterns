package com.design.pattern.builder.impl;

import java.io.Serializable;

//import org.springframework.util.Assert;

//import com.fasterxml.jackson.annotation.JsonProperty;


public class Payload<T> implements Serializable {

	private static final long serialVersionUID = 1L;

//	@JsonProperty
	private T payload;

//	@SuppressWarnings("deprecation")
	public Payload(T body) {
//		Assert.notNull(body);
		this.payload = body;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("rawtypes")
		Payload other = (Payload) obj;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Payload [payload=" + payload + "]";
	}
}
