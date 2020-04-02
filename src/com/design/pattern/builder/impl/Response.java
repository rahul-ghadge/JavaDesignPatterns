package com.design.pattern.builder.impl;

import java.io.Serializable;
import java.util.Collection;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class Response implements Serializable {

	private static final long serialVersionUID = 1L;

//	@JsonProperty
	private Payload<?> payload;
//	@JsonProperty
	private Status status;
//	@JsonProperty
	private Collection<Errors> errors;
//	@JsonProperty
	private Error error;

	public Payload<?> getPayload() {
		return payload;
	}

	public void setPayload(Payload<?> payload) {
		this.payload = payload;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Collection<Errors> getErrors() {
		return errors;
	}

	public void setErrors(Collection<Errors> errors) {
		this.errors = errors;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	
	
	public static class Builder {
		
		private Response response = new Response();
		
		public Response build(){
			return this.response;
		}
		
		
		public Builder payload(Payload<?> payload){
			this.response.setPayload(payload);
			return this;
		}
		
		public Builder status(Status status){
			this.response.setStatus(status);
			return this;
		}
		
		public Builder errors(Collection<Errors> errors) {
			this.response.setErrors(errors);
			return this;
		}
		
		public Builder error(Error error) {
			this.response.setError(error);
			return this;
		}
	}


	@Override
	public String toString() {
		return "Response [payload=" + payload + ", status=" + status + ", errors=" + errors + ", error=" + error + "]";
	}
}
