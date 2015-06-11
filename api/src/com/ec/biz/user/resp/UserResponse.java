package com.ec.biz.user.resp;

import com.ec.biz.user.resp.base.BaseResponse;
import com.ec.common.query.QueryPage;


public class UserResponse extends BaseResponse{

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -1303455446241282595L;

	private QueryPage page;

	public QueryPage getPage() {
		return page;
	}

	public void setPage(QueryPage page) {
		this.page = page;
	}
	
	
	
}
