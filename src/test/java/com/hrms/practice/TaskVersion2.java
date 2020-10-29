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

public class TaskVersion2 {
	// display the information from nationality table 
	// but display id as nationality id, name as nationality name 
	
	String dbusername = "syntax_hrm";
	String dbpasssword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	
	@Test
	public void method1() throws SQLException {
		Connection con = DriverManager.getConnection(dbUrl,dbusername,dbpasssword );
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select * from ohrm_nationality");
		ResultSetMetaData rsmd = rs.getMetaData();
		
		List<Map<String,String>> listData = new ArrayList<>();
		Map<String, String> mapData;
		while(rs.next()) {
			mapData = new LinkedHashMap<>();
			for(int i = 1; i<=rsmd.getColumnCount(); i++) {
				String colName = rsmd.getColumnName(i); //actual column name
				
				if(colName.contentEquals("id")) {
					colName ="Nationality ID";
				}else if(colName.contentEquals("name")) {
					colName = "Nationaltiy Name";
				}
				String value = rs.getObject(i).toString();
				mapData.put(colName, value);
				
			}
			listData.add(mapData);
		}
		System.out.println(listData);
		rs.close();
		st.close();
		con.close();
	}
	
	String dbU = "";
	String dbUse = "";
	String dbPass = "";
	@Test
	public void someStuff() throws SQLException {
		Connection conn = DriverManager.getConnection(dbU,dbUse,dbPass);
		Statement st= conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_employee");
		ResultSetMetaData rsmd1 = rs.getMetaData();
		List<Map<String, String>> listdata = new ArrayList<>();
		Map<String,String> mapdata;
		
		
		while(rs.next()) {
			mapdata = new LinkedHashMap<>();
			for(int i = 1; i<=rsmd1.getColumnCount();i++) {
				String colname = rsmd1.getColumnName(i);
				if(colname.contentEquals("id")) {
					colname = "NAT ID";
					
				}else if(colname.contentEquals("name")) {
					colname = "NAT NAME";
				}
				String valuee = rs.getObject(i).toString();
				mapdata.put(colname, valuee);
			}
			listdata.add(mapdata);
		}
		System.out.println(listdata);
		
		rs.close();
		st.close();
		conn.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
