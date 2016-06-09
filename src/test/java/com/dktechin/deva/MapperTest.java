package com.dktechin.deva;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class MapperTest extends SpringTest {
	
	@Inject
	SqlSessionFactory sf;
	
	//@Test
	public void sfTest() throws Exception{
		SqlSession session = sf.openSession();
		log.info("---------------------------");
		log.info(session.selectOne("com.dktechin.deva.mappers.Timmer.getTime"));
		log.info("---------------------------");
	}
	
}
