package com.xworkz.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJdbc {

	public static void main(String[] args) {


		System.out.println("invoking main in java jdbc");
		
		
		String jdbcUrl="jdbc:mysql://localhost:3306/location";
		String userName="root";
		String password="9008@Darshan";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		System.out.println("establishing connection");
		//String query="INSERT INTO location(id,name,city,state,pincode) VALUES(1,'Rajajinagar','Bengaluru','Karnataka',566010)";
		
		
	
		try {
			Connection conn=DriverManager.getConnection(jdbcUrl,userName, password);
			System.out.println("It is Connection Succesful");
			Statement stmt=conn.createStatement();
			//stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
