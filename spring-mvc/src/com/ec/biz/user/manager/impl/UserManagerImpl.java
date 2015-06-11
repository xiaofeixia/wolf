package com.ec.biz.user.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ec.biz.user.dao.UserDao;
import com.ec.biz.user.domain.User;
import com.ec.biz.user.manager.UserManager;
import com.ec.biz.user.query.UserQuery;
import com.ec.common.query.QueryPage;

@Repository("userManager")
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserDao userDao;

	@Override
	public Long addUser(User user) {
		return userDao.insert(user);
	}

	@Override
	public Long editUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public Long deleteById(User user) {
		return userDao.deleteById(user);
	}

	@Override
	public Long updateIsDeleted(User user) {
		return userDao.updateIsDeleted(user);
	}

	@Override
	public QueryPage getUserList(UserQuery query) {

		return userDao.getUserList(query);
	}

}
