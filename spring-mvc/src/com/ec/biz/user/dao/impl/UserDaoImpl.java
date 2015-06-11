package com.ec.biz.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.ec.biz.user.dao.UserDao;
import com.ec.biz.user.domain.User;
import com.ec.biz.user.query.UserQuery;
import com.ec.common.dao.BaseDAO;
import com.ec.common.query.QueryPage;

@Repository("userDao")
public class UserDaoImpl extends BaseDAO implements UserDao {

	private String SQLMAP_SPACE = "UserSQL.";

	@Override
	public Long insert(User user) {
		Long result = (Long) this.getSqlMapClientTemplate().insert(
				SQLMAP_SPACE + "addUser", user);
		return result == null ? 0L : result.longValue();
	}

	@Override
	public QueryPage getUserList(UserQuery query) {
		QueryPage page = this.getPagination(query, SQLMAP_SPACE
				+ "getUserListCount", SQLMAP_SPACE + "getUserList");
		return page;
	}

	@Override
	public Long updateIsDeleted(User user) {
		Long record = (long) this.getSqlMapClientTemplate().update(
				SQLMAP_SPACE + "updateIsDeleted", user);
		return record;
	}

	@Override
	public Long deleteById(User user) {
		long record = (long) this.getSqlMapClientTemplate().delete(
				SQLMAP_SPACE + "deleteById", user);
		return record;
	}

	@Override
	public Long updateUser(User user) {
		long record = (long) this.getSqlMapClientTemplate().update(
				SQLMAP_SPACE + "updateUser", user);
		return record;
	}

}
