package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementQuery1 {

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
		
		String query="INSERT INTO college(name,location,pincode) VALUES(?,?,?)";
		String query1="UPDATE college set location=? WHERE name=?"; 
		
		
		try {
			Connection conn=DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt= conn.prepareStatement(query);
			PreparedStatement pstmt1= conn.prepareStatement(query1);
			pstmt.setString(1, "PESITM");
			pstmt.setString(2, "Shivamogga");
			pstmt.setLong(3, 577222l);
			pstmt.execute();
			
			pstmt.setString(1, "JNNC");
			pstmt.setString(2, "Shivamogga");
			pstmt.setLong(3, 577201l);
			pstmt.execute();
			
			pstmt.setString(1, "Sacred heart");
			pstmt.setString(2, "Bhadravathi");
			pstmt.setLong(3, 577221l);
			pstmt.execute();
			
			pstmt.setString(1, "DVS");
			pstmt.setString(2, "Thirthahalli");
			pstmt.setLong(3, 577202);
			pstmt.execute();
			
			pstmt.setString(1, "REVA");
			pstmt.setString(2, "Bengaluru");
			pstmt.setLong(3, 522301l);
			pstmt.execute();
			
			pstmt.setString(1, "BMS");
			pstmt.setString(2, "Bangalore");
			pstmt.setLong(3, 522311l);
			pstmt.execute();
			
			pstmt.setString(1, "RVCE");
			pstmt.setString(2, "Bengaluru rural");
			pstmt.setLong(3, 522111l);
			pstmt.execute();
			
			pstmt.setString(1, "RNSIT");
			pstmt.setString(2, "Mysuru");
			pstmt.setLong(3, 511677l);
			pstmt.execute();
			
			pstmt.setString(1, "Nitte");
			pstmt.setString(2, "Moodbidre");
			pstmt.setLong(3, 599999l);
			pstmt.execute();
			
			pstmt1.setString(1, "SHIVAMOGGA");
			pstmt1.setString(2, "PESITM");
			pstmt1.executeUpdate();
			
			pstmt1.setString(1, "SHIVAMOGGA");
			pstmt1.setString(2, "JNNC");
			pstmt1.executeUpdate();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("insert successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
