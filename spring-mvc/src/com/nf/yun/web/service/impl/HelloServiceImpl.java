package com.nf.yun.web.service.impl;

import org.springframework.stereotype.Service;

import com.ec.common.service.BaseService;
import com.nf.yun.web.service.HelloService;

@Service
public class HelloServiceImpl extends BaseService implements HelloService {

	@Override
	public String hello() {
		return "Hello world spring mvc";

	}

}
