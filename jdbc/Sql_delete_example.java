package com.jdbc;

public class Sql_delete_example {

	public static void main(String[] args) {
		Details details=new Details();
		

		String url = details.url_detail();
		String UserName = details.user_name();
		String Password = details.password();
		
		String deleteQuery = "delete from student where stdId=?";
		details.delete_Values(url,UserName,Password,deleteQuery);

	}

}
