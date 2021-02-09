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

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.junit.Test;

import junit.framework.Assert;

public class LastHwSql {
	
	// HW
	// login to hrms
	// go to admin - jobs - job titles
	// verify all job titles against DB job titles
	
	String dbusername = "syntax_hrm";
	String dbpasssword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";
	
	@Test
	public void method2() throws SQLException {
	Connection con  = DriverManager.getConnection(dbUrl, dbusername, dbpasssword);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from ohrm_job_title");
	ResultSetMetaData rsmd = rs.getMetaData();
	
	List<Map<String, String>> listData = new ArrayList<>();
	Map<String, String> mapData;
	
	while(rs.next()) {
		mapData = new LinkedHashMap<>();
		for(int i = 1;i<=rsmd.getColumnCount();i++) {
			String colName = rsmd.getColumnName(i);
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
	
	

}
