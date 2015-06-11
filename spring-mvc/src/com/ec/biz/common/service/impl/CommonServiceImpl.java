package com.ec.biz.common.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.biz.common.enums.EnumErrorCode;
import com.ec.biz.common.operator.AbstractServiceOperator;
import com.ec.biz.common.operator.ServiceOperatorFactory;
import com.ec.biz.common.req.BaseServiceRequest;
import com.ec.biz.common.resp.BaseServiceResponse;
import com.ec.biz.common.service.CommonService;

@Service("commonService")
public class CommonServiceImpl implements CommonService {

	@Autowired
	private ServiceOperatorFactory serviceOperatorFactory;
	
	@Override
	public void execute(BaseServiceRequest request, BaseServiceResponse response) {

		// 判断服务操作
		if(serviceOperatorFactory == null){
			response.setErrorCode(EnumErrorCode.ERROR_UNKOWN.getErrorCode());
			response.setErrorMsg(EnumErrorCode.ERROR_UNKOWN.getErrorMsg());
			return;
		}
		// 判断接口Code
		if(StringUtils.isBlank(request.getPageCode())){
			response.setErrorCode(EnumErrorCode.ERROR_PARAMETER.getErrorCode());
			response.setErrorMsg(EnumErrorCode.ERROR_PARAMETER.getErrorMsg());
			return;
		}
		// 获取具体的操作类
		AbstractServiceOperator operator = serviceOperatorFactory.getOperatorByCode(request.getPageCode());
		if(operator == null){
			response.setErrorCode(EnumErrorCode.ERROR_UNSUPPORT.getErrorCode());
			response.setErrorMsg(EnumErrorCode.ERROR_UNSUPPORT.getErrorMsg());
			return;
		}
		operator.execute(request, response);
		
	}

}
