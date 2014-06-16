package com.emaster.web.util;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class DBUtil {
	
	public static Reader reader;
	public static SqlMapClient smc;

	static {

		try {

			if (reader == null) {
				reader = Resources.getResourceAsReader("db-conf/sqlmapconfig.xml");
				smc = SqlMapClientBuilder.buildSqlMapClient(reader);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
