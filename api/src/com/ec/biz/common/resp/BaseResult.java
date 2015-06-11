package com.ec.biz.common.resp;

import java.io.Serializable;

public class BaseResult<T, D> implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 3639237516168226001L;
	
	private T resultCode;
	
	private D detailCode;

	public T getResultCode() {
		return resultCode;
	}

	public void setResultCode(T resultCode) {
		this.resultCode = resultCode;
	}

	public D getDetailCode() {
		return detailCode;
	}

	public void setDetailCode(D detailCode) {
		this.detailCode = detailCode;
	}

}
