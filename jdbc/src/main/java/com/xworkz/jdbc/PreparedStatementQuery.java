package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementQuery {

	public static void main(String[] args) {


		System.out.println("invoking iin main method");
		String url = "jdbc:mysql://localhost:3308/movie";
		String username = "root";
		String password = "9008@Darshan";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query="INSERT INTO MovieList(id,name,director,budget) VALUES(?,?,?,?)";

		
		 try {
			Connection connect = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt =connect.prepareStatement(query);
			pstmt.setInt(1, 11);
			pstmt.setString(2, "yash");
			
			pstmt.setString(3, "rajmouli");
			pstmt.setLong(4, 3400000l);
			pstmt.execute();
			
			pstmt.setInt(1, 12);
			pstmt.setString(2, "Darshan");
			pstmt.setString(3, "sudeep");
			pstmt.setLong(4, 4500000l);
			pstmt.execute();
			
			pstmt.setInt(1, 13);
			pstmt.setString(2, "Chandan");
			pstmt.setString(3, "Sudeep");
			pstmt.setLong(4, 5000000l);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 System.out.println("insert successfully");
	}

}
