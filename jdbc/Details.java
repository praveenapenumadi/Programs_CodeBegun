package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Details {
	
	public String url_detail() {
		String url="jdbc:mysql://127.0.0.1:3306/test_db";
		return url;
	}
	public String user_name() {
		String username="root";
		return username;
	}
	public String password() {
		String password="root";
		return password;
	}
	
	public void insert_valuesTable(String url,String username,String password,String query) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		    statement=connection.prepareStatement(query);
			statement.setInt(1, 1);
			statement.setString(2,"praveena");
			statement.setInt(3, 91);
			statement.setString(4,"F");
			int nOfRows = statement.executeUpdate();
			System.out.println(nOfRows+" row inserted..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete_Values(String url,String username,String password,String query) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		    statement=connection.prepareStatement(query);
			statement.setInt(1, 1);
			
			int nOfRows = statement.executeUpdate();
			System.out.println(nOfRows+" row deleted..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update_Table(String url,String username,String password,String query) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		    statement=connection.prepareStatement(query);
		    
		    statement.setString(1, "Gnapika");
			statement.setInt(2,1);
			
			int nOfRows = statement.executeUpdate();
			System.out.println(nOfRows+" updated..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void select_table(String url,String username,String password,String query)
	{
		
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			connection=DriverManager.getConnection(url,username,password);
			statement=connection.createStatement();
			resultSet=statement.executeQuery(query);
			while(resultSet.next())
			{
				System.out.println(resultSet.getString("stdName"));
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	


}
