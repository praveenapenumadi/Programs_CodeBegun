package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sql_Insert_Example {

	public static void main(String[] args) throws SQLException {
		Details details=new Details();
		Sql_Insert_Example obj = new Sql_Insert_Example();

		String url = details.url_detail();
		String UserName = details.user_name();
		String Password = details.password();
		String insertQuery = "insert into student(stdId,stdName,MNumber,gender) values(?,?,?,?)";
		details.insert_valuesTable(url,UserName,Password,insertQuery);
		
	}

	
}
