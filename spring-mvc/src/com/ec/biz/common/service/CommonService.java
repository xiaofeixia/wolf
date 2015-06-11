package com.ec.biz.common.service;

import com.ec.biz.common.req.BaseServiceRequest;
import com.ec.biz.common.resp.BaseServiceResponse;

public interface CommonService {

	public void execute(BaseServiceRequest request,BaseServiceResponse response);
}
