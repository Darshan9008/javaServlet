package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcQuery {
	
	public static void main(String[] args) {
		
		System.out.println("invoking iin main method");
		String url = "jdbc:mysql://localhost:3306/location";     //locstion is database name
		String username = "root";
		String password = "9008@Darshan";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");      //url for sql
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getting connection");
		
		
		String query="Select * from location where name='btm'";    //sql query 
		
		try {
			Connection conn=DriverManager.getConnection(url, username, password);  //getting connnection for sql
			
			Statement stmt=conn.createStatement();    //connecting the sql
			ResultSet set=stmt.executeQuery(query);
			if(set.next()) {                                         //printing the value based on condition
				System.out.println("result present in resultset ");
				System.out.println("location name->"+set.getString("name"));
				System.out.println("city name->"+set.getString("city"));
				System.out.println("pincode -> "+set.getInt("pincode"));
				
			}
			System.out.println("fetched records...........");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
