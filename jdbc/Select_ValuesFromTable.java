package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_ValuesFromTable {

	public static void main(String[] args)throws SQLException {
		Details details= new Details();
		String url=details.url_detail();
		String username=details.user_name();
		String password=details.password();
		String query="select * from student";
		details.select_table(url, username, password, query);
		

	}
	

}
