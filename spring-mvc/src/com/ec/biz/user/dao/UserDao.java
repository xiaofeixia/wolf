package com.ec.biz.user.dao;

import com.ec.biz.user.domain.User;
import com.ec.biz.user.query.UserQuery;
import com.ec.common.query.QueryPage;

public interface UserDao {

	public Long insert(User user);
	
	public QueryPage getUserList(UserQuery query);
	
	public Long updateIsDeleted(User user);
	
	public Long deleteById(User user);
	
	public Long updateUser(User user);
}
