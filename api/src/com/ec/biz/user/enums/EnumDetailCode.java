package com.ec.biz.user.enums;

public enum EnumDetailCode {

	OK("OK", "");

	private String key;
	private String message;

	EnumDetailCode(String key, String message) {
		this.key = key;
		this.message = message;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
