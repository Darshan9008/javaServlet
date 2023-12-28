package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WhileQuery {

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
		
		String query = "SELECT *FROM MovieList";


		
		try {
			Connection connect = DriverManager.getConnection(url, username, password);
			
			
			Statement stat = connect.createStatement();
			ResultSet ref = stat.executeQuery(query);
			while (ref.next()) {
			int id = ref.getInt("id");
			String name = ref.getString("name");
			String director = ref.getString("director");
			Long budget = ref.getLong("budget");
			System.out.println("Id:" + id + " , Name:" + name + " , Director:" + director + " , Budget:" + budget);
			}
			System.out.println("Fetched all records!!!!!!!!!!!!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
