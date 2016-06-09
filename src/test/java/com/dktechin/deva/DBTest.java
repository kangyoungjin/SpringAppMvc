package com.dktechin.deva;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;

public class DBTest extends SpringTest {
	
	@Inject
	DataSource ds;
	
	@Test
	public void testDb() throws Exception{
		log.info("-------------------------");
		//log.info(ds.getConnection());
		log.info("-------------------------");		
	}
	
}
