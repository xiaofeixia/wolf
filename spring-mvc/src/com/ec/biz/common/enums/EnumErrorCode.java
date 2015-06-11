package com.ec.biz.common.enums;

public enum EnumErrorCode {
	/**
	 * 未知异常
	 */
	ERROR_UNKOWN("001", "未知异常"),
	/**
	 * 参数异常
	 */
	ERROR_PARAMETER("002", "参数异常"),
	/**
	 * 不支持
	 */
	ERROR_UNSUPPORT("003", "不支持");

	/**
	 * 错误消息code
	 */
	public String errorCode;
	/**
	 * 错误消息描述
	 */
	public String errorMsg;

	EnumErrorCode(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
