package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MetaDataHW {
	// HW get the resultset metadata store it in arraylist,
	// retrieve from arraylist and print
	// in console also get column type name and get table names

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	@Test
	public void rsMetaData() throws SQLException {
		Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_emp_work_experience");
		ResultSetMetaData rsMD = rs.getMetaData();
		
		String tableName = rsMD.getTableName(1);
		System.out.println("The table name is "+tableName);
		
		int columnCount  = rsMD.getColumnCount();
		System.out.println("There are "+columnCount+ " columns.");
		
		List<String> workExperience = new ArrayList<>();
		for(int i=1;i<=rsMD.getColumnCount();i++) {
			String colNames = rsMD.getColumnName(i);
			workExperience.add(colNames);
			
		}
		System.out.println("---------------------");
		System.out.println("Column names are; ");
		
		System.out.println(workExperience);
		for(String workex:workExperience) {
			System.out.println(workex);
		}
		
		
		
		System.out.println("---------------------");
		System.out.println("Column type names are; ");
		for(int i = 1; i<=columnCount; i++) {
			String colTypeNames = rsMD.getColumnTypeName(i);
			System.out.println(colTypeNames);
			
		}
		
		
	
		rs.close();
		st.close();
		con.close();

	}
}
