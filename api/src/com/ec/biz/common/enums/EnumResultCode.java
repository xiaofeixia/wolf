package com.ec.biz.common.enums;

public enum EnumResultCode {

	SUCCESS("success","成功"),
	FAILURE("failure","失败");
	
	private String key;
	
	private String code;

	EnumResultCode(String key,String code){
		this.key = key;
		this.code = code;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	
	
	
}
