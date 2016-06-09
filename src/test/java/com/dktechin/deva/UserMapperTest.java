package com.dktechin.deva;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.dktechin.deva.mappers.UserMapper;
import com.dktechin.deva.vo.CriteriaVO;
import com.dktechin.deva.vo.UsersVO;

public class UserMapperTest extends SpringTest{
	
	@Inject
	UserMapper um;
	
	/*@Test
	public void insertTest() throws Exception{
		UsersVO uv = new UsersVO();
		uv.setUser_name("노라");
		uv.setUser_nick("흥소리");
		uv.setUser_password("5555");
		uv.setUser_addr("세종특별시 AA구 BB동 345번지");
		uv.setUser_email("sori@daum.net");
		uv.setUser_phone("010-3455-2342");
		uv.setUser_desc("테스트 이런 저런 계정 입니다. .!!!");
		uv.setUser_issys("N");
		um.create(uv);
		
	}*/
	
	/*@Test
	public void selectTest() throws Exception{
		UsersVO uv = new UsersVO();
		
		uv = um.read("sodaboy2000@kakaocorp.com");
		log.info("------------------------------");
		log.info(uv.toString());
		log.info("------------------------------");
	}*/
	
	/*@Test
	public void updateTest() throws Exception{
		UsersVO uv = new UsersVO();
		
		uv.setUser_name("김 병만---update");
		uv.setUser_nick("생활의 달인---");
		uv.setUser_password("1111--");
		uv.setUser_addr("서울특별시 영등포구 여의도동 323-13번지");
		uv.setUser_email("kimbm@naver.com");
		uv.setUser_phone("01009323233");
		uv.setUser_desc("kbs 개콘 달인...");
		uv.setUser_issys("N");
		
		um.update(uv);
		
	}*/
	
/*	@Test
	public void deleteTest() throws Exception{
		um.delete("sodabo2000@kakaocorp.com");
	}
	*/
	
	@Test
	public void listTest()throws Exception{
		CriteriaVO cvo = new CriteriaVO();
		List<UsersVO> ulist = new ArrayList<UsersVO>();

		String[] type = {"user_phone"};
		cvo.setPage(1);
		cvo.setType(type);
		cvo.setKeyword("010");
		
		ulist = um.list(cvo);
		log.info("---------------------------");
		log.info(ulist.toString());
		log.info("---------------------------");
	}
	
}
