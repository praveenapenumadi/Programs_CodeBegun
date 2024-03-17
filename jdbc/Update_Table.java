package com.jdbc;

public class Update_Table {

	public static void main(String[] args) {
Details details=new Details();
		

		String url = details.url_detail();
		String UserName = details.user_name();
		String Password = details.password();
		
		String updateQuery = "update student set stdName=? where stdId=?";
		details.update_Table(url,UserName,Password,updateQuery);

	}

}
