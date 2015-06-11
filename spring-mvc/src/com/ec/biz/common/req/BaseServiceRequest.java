package com.ec.biz.common.req;

import java.io.Serializable;

public class BaseServiceRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -973655915717162771L;

	/**
	 * 页面code
	 */
	private String pageCode;

	public String getPageCode() {
		return pageCode;
	}

	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}

}
