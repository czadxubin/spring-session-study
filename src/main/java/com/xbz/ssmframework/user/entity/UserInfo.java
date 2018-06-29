package com.xbz.ssmframework.user.entity;

import java.util.Date;

public class UserInfo {
	private Long id;
	private String username;
	private String password;
	private Date insertTimeForHis;
	private Date updateTimeForHis;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getInsertTimeForHis() {
		return insertTimeForHis;
	}
	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}
	public Date getUpdateTimeForHis() {
		return updateTimeForHis;
	}
	public void setUpdateTimeForHis(Date updateTimeForHis) {
		this.updateTimeForHis = updateTimeForHis;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", password=" + password + ", insertTimeForHis="
				+ insertTimeForHis + ", updateTimeForHis=" + updateTimeForHis + "]";
	}
}
