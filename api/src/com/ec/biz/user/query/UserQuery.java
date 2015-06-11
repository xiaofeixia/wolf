package com.ec.biz.user.query;

import com.ec.common.query.QueryPage;

public class UserQuery extends QueryPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1314241188929594739L;

	private Long id;
	
	private String userName;
	
	private Integer sex;
	
	private String realName;
	
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
