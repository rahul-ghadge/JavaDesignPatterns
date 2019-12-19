package com.arya.demo.builder;

import java.io.Serializable;
import java.util.List;


public class ResponseTemplate<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String SUCCESS = "OK";

	@SuppressWarnings("rawtypes")
	Body body = new Body();

	private Status status = new Status();
	private Errors errors = new Errors();

	public ResponseTemplate() {
		this.body = null;
		this.errors = null;
		this.status.setStatusCode(200);
		this.status.setStatusValue(SUCCESS);
	}

	@SuppressWarnings("unchecked")
	public ResponseTemplate(int statusCode, String statusValue, T payload, Errors erros) {
		body.setPayload(payload);
		this.status.setStatusCode(statusCode);
		this.status.setStatusValue(statusValue);
		this.errors = erros;
	}

	public static <T> ResponseTemplate<T> success() {
		return new ResponseTemplate<T>(ResponseStatus.SUCCESS.ordinal() - 1, SUCCESS, null, null);
	}

	public static <T> ResponseTemplate<T> success(T payload) {
		return new ResponseTemplate<T>(ResponseStatus.SUCCESS.ordinal() - 1, SUCCESS, payload, null);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> ResponseTemplate<T> success(List<T> payloadList) {
		return new ResponseTemplate(ResponseStatus.SUCCESS.ordinal() - 1, SUCCESS, payloadList, null);
	}

	public static <T> ResponseTemplate<T> error(String message, T payload) {
		return new ResponseTemplate<T>(ResponseStatus.ERROR.ordinal() + 1, message, payload, null);
	}

	public static <T> ResponseTemplate<T> error(int errorCode, String message, T payload) {
		return new ResponseTemplate<T>(errorCode, message, payload, null);
	}

	public static <T> ResponseTemplate<T> error(int errorCode, String message) {

		Errors errors = new Errors();
		errors.setErrorCode(errorCode);
		errors.setErrorMessage(message);

		return new ResponseTemplate<T>(errorCode, message, null, errors);
	}

	public static <T> ResponseTemplate<T> error(String message) {
		Errors errors = new Errors();
		errors.setErrorMessage(message);

		return new ResponseTemplate<T>(ResponseStatus.ERROR.ordinal() + 1, message, null, errors);
	}

	@SuppressWarnings("rawtypes")
	public Body getBody() {
		return body;
	}

	@SuppressWarnings("rawtypes")
	public void setBody(Body body) {
		this.body = body;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Errors getErrors() {
		return errors;
	}

	public void setErrors(Errors errors) {
		this.errors = errors;
	}
	
	@Override
	public int hashCode(){
		return super.hashCode();
	}

	
	@Override
	public boolean equals(Object obj){
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "ResponseTemplate [body=" + body + ", status=" + status
				+ ", errors=" + errors + "]";
	}	
}
