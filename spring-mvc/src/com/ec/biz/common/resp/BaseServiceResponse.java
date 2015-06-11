package com.ec.biz.common.resp;

import java.io.Serializable;

public class BaseServiceResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5141146651611890068L;

	/**
	 * 是否执行成功
	 */
	private boolean isSuccess = true;
	/**
	 * 错误消息code
	 */
	private String errorCode;
	/**
	 * 错误消息描述
	 */
	private String errorMsg;
	/**
	 * 返回json串
	 */
	private String returnStr;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
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

	public String getReturnStr() {
		return returnStr;
	}

	public void setReturnStr(String returnStr) {
		this.returnStr = returnStr;
	}

}
