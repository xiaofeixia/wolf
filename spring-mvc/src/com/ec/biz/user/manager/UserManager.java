package com.ec.biz.user.manager;

import com.ec.biz.user.domain.User;
import com.ec.biz.user.query.UserQuery;
import com.ec.common.query.QueryPage;

public interface UserManager {

	public Long addUser(User user);
	
	public Long editUser(User user);
	
	public Long deleteById(User user);
	
	public Long updateIsDeleted(User user);
	
	public QueryPage getUserList(UserQuery query);
}
