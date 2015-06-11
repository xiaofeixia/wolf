package com.ec.biz.user.service;

import com.ec.biz.user.req.UserRequest;
import com.ec.biz.user.resp.UserResponse;

public interface UserService {

	public UserResponse addUser(UserRequest request);

	public UserResponse editUser(UserRequest request);

	public UserResponse deleteUserById(UserRequest request);

	public UserResponse updateIsDeleted(UserRequest request);

	public UserResponse getUserList(UserRequest request);
}
