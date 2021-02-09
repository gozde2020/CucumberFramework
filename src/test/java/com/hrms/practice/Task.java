package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
//// display the information from nationality table 
// but display id as nationality id, name as nationality name 
public class Task {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";
	
	@Test
	public void advancedStuff() throws SQLException {
		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select id , name from ohrm_nationality");
		ResultSetMetaData rsmd = rs.getMetaData();
		List<Map<String, String>> listData = new ArrayList<>();
		Map<String, String >mapData ;
		while(rs.next()) {
			mapData = new LinkedHashMap<>();
			for(int i = 1; i<=rsmd.getColumnCount(); i++) {
				String colName = rsmd.getColumnName(i); //actual column name
				
				if(colName.contentEquals("id")) {
					colName = "Nationality ID";
					
				}else if ((colName.equals("name"))) {
					colName = "Nationality Name";
				}	
					String value =rs.getObject(i).toString();
					mapData.put(colName, value);
					
				
				
				}
			
			//mapData.put("nationality id", rs.getObject("id").toString());
			//mapData.put("nationality name", rs.getObject("name").toString());
			
			
			listData.add(mapData);
		}
		System.out.println(listData);
		
		rs.close();
		st.close();
		con.close();
}
}