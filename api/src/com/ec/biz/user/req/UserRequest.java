package com.ec.biz.user.req;

import com.ec.biz.common.req.BaseRequest;
import com.ec.biz.user.dto.UserDto;
import com.ec.biz.user.query.UserQuery;

public class UserRequest extends BaseRequest {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 4134006383887652434L;

	private UserDto userDto;

	private UserQuery userQuery;

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public UserQuery getUserQuery() {
		return userQuery;
	}

	public void setUserQuery(UserQuery userQuery) {
		this.userQuery = userQuery;
	}

}
