package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) {

		System.out.println("invoking iin main method");
		String url = "jdbc:mysql://localhost:3308/location";
		String username = "root";
		String password = "9008@Darshan";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getting connection");
		String insert = "Insert into location_info(id,name) values(1,'darshan')";
		String insert1 = "Insert into location_info(id,name) values(2,'chandan')";
		String insert2= "Insert into location_info(id,name) values(3,'venu')";
		String insert3 = "Insert into location_info(id,name) values(4,'vaasu')";
		String insert4 = "Insert into location_info(id,name) values(5,'jeevan')";
		String insert5 = "Insert into location_info(id,name) values(6,'vinay')";
		String insert6 = "Insert into location_info(id,name) values(7,'harshith')";
		String insert7 = "Insert into location_info(id,name) values(8,'yellu')";


		try {
			Connection connect = DriverManager.getConnection(url, username, password);
			
			Statement stmt = connect.createStatement();
			System.out.println("connection establised");
			stmt.execute(insert);
			stmt.execute(insert1);
			stmt.execute(insert2);
			stmt.execute(insert3);
			stmt.execute(insert4);
			stmt.execute(insert5);
			stmt.execute(insert6);
			stmt.execute(insert7);


			
			System.out.println("It is Inserted>...........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
