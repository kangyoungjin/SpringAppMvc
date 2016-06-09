package com.dktechin.deva.service;

import javax.inject.Inject;

import org.junit.Test;

import com.dktechin.deva.SpringTest;
import com.dktechin.deva.vo.UsersVO;

public class UserServiceTest extends SpringTest {
	
	@Inject
	UsersService us;
	
	//@Test
	public void createUserMethod() throws Exception{
		UsersVO uv = new UsersVO();
		uv.setUser_name("나오미");
		uv.setUser_nick("밴드 나오미");
		uv.setUser_password("8989");
		uv.setUser_addr("세종특별시 동작구 수서동 1111-345번지");
		uv.setUser_email("naomi@daum.net");
		uv.setUser_phone("010-7777-7777");
		uv.setUser_desc("테스트 이런 저런 계정 입니다. .!!!");
		uv.setUser_issys("N");	
		us.create(uv);
	}
	
}
