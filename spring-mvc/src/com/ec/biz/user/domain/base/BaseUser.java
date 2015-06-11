package com.ec.biz.user.domain.base;

import java.io.Serializable;
import java.util.Date;

public class BaseUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6765625919718925003L;

	private Long id;
	
	private String userName;
	
	private Integer sex;
	
	private String realName;
	
	private String password;
	// 创建时间
	private Date gmtCreate;
	// 更新时间
	private Date gmtModify;
	// 是否删除的标识
	private String isDeleted;

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

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModify() {
		return gmtModify;
	}

	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
