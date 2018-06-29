package com.xbz.ssmframework.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xbz.ssmframework.config.annotation.SecondUserService;
import com.xbz.ssmframework.user.service.UserService;

@Configuration
@Component
public class RedisSessionRepositoryConfigTest implements InitializingBean{
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	private UserService secondUserService;
	
	@Autowired
	public void setSecondUserService(@SecondUserService ObjectProvider<UserService> secondUserService){
		this.secondUserService = secondUserService.getIfAvailable();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("userService:"+userService);
		System.out.println("secondUserService:"+secondUserService);
	}
}
