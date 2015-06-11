package com.ec.biz.demo.operator;

import org.springframework.stereotype.Service;

import com.ec.biz.common.operator.AbstractServiceOperator;
import com.ec.biz.common.req.BaseServiceRequest;
import com.ec.biz.common.resp.BaseServiceResponse;

@Service("demoServiceOperator")
public class DemoServiceOperator extends AbstractServiceOperator {

	@Override
	public void checkParam(BaseServiceRequest request,
			BaseServiceResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void convertData(BaseServiceRequest request,
			BaseServiceResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postProcessing(BaseServiceRequest request,
			BaseServiceResponse respone) {
		// TODO Auto-generated method stub

	}

}
