package com.xbz.ssmframework.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.xbz.ssmframework.user.entity.UserInfo;

@Mapper
public interface UserInfoMapper {
	/**
	 * 根据用户名查询用户信息
	 * @param username
	 * @return
	 */
	public UserInfo selectOneByUsername(String username);
}
