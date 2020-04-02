package com.design.pattern.builder.impl;

import java.io.Serializable;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class Status implements Serializable {

	private static final long serialVersionUID = 1L;

//	@JsonProperty
	private int statusCode;
//	@JsonProperty
	private String statusValue;

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getStatusValue() {
		return statusValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + statusCode;
		result = prime * result + ((statusValue == null) ? 0 : statusValue.hashCode());
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
		Status other = (Status) obj;
		if (statusCode != other.statusCode)
			return false;
		if (statusValue == null) {
			if (other.statusValue != null)
				return false;
		} else if (!statusValue.equals(other.statusValue))
			return false;
		return true;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private Status status = new Status();

		public Status build() {
			return this.status;
		}

		public Builder statusValue(String statusValue) {
			this.status.setStatusValue(statusValue);
			return this;
		}

		public Builder setStatusCode(int statusCode) {
			this.status.setStatusCode(statusCode);
			return this;
		}
	}

	
	@Override
	public String toString() {
		return "Status [statusCode=" + statusCode + ", statusValue=" + statusValue + "]";
	}	
}
