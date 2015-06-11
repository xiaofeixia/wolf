package com.ec.biz.user.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.biz.common.enums.EnumResultCode;
import com.ec.biz.user.domain.User;
import com.ec.biz.user.dto.UserDto;
import com.ec.biz.user.enums.EnumDetailCode;
import com.ec.biz.user.manager.UserManager;
import com.ec.biz.user.req.UserRequest;
import com.ec.biz.user.resp.UserResponse;
import com.ec.biz.user.service.UserService;
import com.ec.common.query.QueryPage;
import com.ec.common.service.BaseService;

@Service
public class UserServiceImpl extends BaseService implements UserService {

	@Autowired
	private UserManager userManager;

	@Override
	public UserResponse addUser(UserRequest request) {

		logger.info("UserServiceImpl.addUser method");
		UserResponse response = new UserResponse();
		try {
			UserDto userDto = request.getUserDto();
			User user = new User();
			// copy 属性值
			BeanUtils.copyProperties(userDto, user);
			long record = userManager.addUser(user);
			if (record > 0) {
				response.setResultCode(EnumResultCode.SUCCESS);
				response.setDetailCode(EnumDetailCode.OK);
			} else {
				response.setResultCode(EnumResultCode.FAILURE);

			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			response.setResultCode(EnumResultCode.FAILURE);
		}
		return response;
	}

	@Override
	public UserResponse editUser(UserRequest request) {
		logger.info("UserServiceImpl.editUser method");
		UserResponse response = new UserResponse();
		try {
			UserDto userDto = request.getUserDto();
			User user = new User();
			BeanUtils.copyProperties(userDto, user);

			long result = userManager.editUser(user);
			if (result > 0L) {
				response.setResultCode(EnumResultCode.SUCCESS);
			} else {
				response.setResultCode(EnumResultCode.FAILURE);
			}

		} catch (Exception e) {
			logger.error("UserServiceImpl.editUser method" + e.getMessage());
			response.setResultCode(EnumResultCode.FAILURE);
		}
		return response;
	}

	@Override
	public UserResponse deleteUserById(UserRequest request) {
		logger.info("UserServiceImpl.deleteUserById method");
		UserResponse response = new UserResponse();
		try {
			UserDto userDto = request.getUserDto();
			User user = new User();
			user.setId(userDto.getId());

			long result = userManager.deleteById(user);
			if (result > 0L) {
				response.setResultCode(EnumResultCode.SUCCESS);
			} else {
				response.setResultCode(EnumResultCode.FAILURE);
			}

		} catch (Exception e) {
			logger.error("UserServiceImpl.deleteUserById method"
					+ e.getMessage());
			response.setResultCode(EnumResultCode.FAILURE);
		}
		return response;
	}

	@Override
	public UserResponse updateIsDeleted(UserRequest request) {
		logger.info("UserServiceImpl.updateIsDeleted method");
		UserResponse response = new UserResponse();
		try {
			UserDto userDto = request.getUserDto();
			User user = new User();
			user.setId(userDto.getId());
			user.setIsDeleted(userDto.getIsDeleted());

			long result = userManager.updateIsDeleted(user);
			if (result > 0L) {
				response.setResultCode(EnumResultCode.SUCCESS);
			} else {
				response.setResultCode(EnumResultCode.FAILURE);
			}

		} catch (Exception e) {
			logger.error("UserServiceImpl.updateIsDeleted method"
					+ e.getMessage());
			response.setResultCode(EnumResultCode.FAILURE);
		}
		return response;
	}

	@Override
	public UserResponse getUserList(UserRequest request) {
		logger.info("UserServiceImpl.getUserList method");
		UserResponse response = new UserResponse();
		try {
			QueryPage page = userManager.getUserList(request.getUserQuery());
			response.setPage(page);
			response.setResultCode(EnumResultCode.SUCCESS);

		} catch (Exception e) {
			logger.error("UserServiceImpl.getUserList method" + e.getMessage());
			response.setResultCode(EnumResultCode.FAILURE);
		}
		return response;
	}

}
