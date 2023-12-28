package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {

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
		
		String updateQuery="UPDATE MovieList set budget=7800000 WHERE name='KGF'";
		String updateQuery1="UPDATE MovieList set director='Rohan' WHERE name='Titanic'";
		String updateQuery2="UPDATE MovieList set budget=5200000 WHERE name='Ironman'";
		String updateQuery3="UPDATE MovieList set name='KGF chapter2' where budget=7800000";
		String updateQuery4="UPDATE MovieList set budget=8000000 WHERE name='Fast and Furious'";
		String updateQuery5="UPDATE MovieList set budget=90000000 WHERE name='Titanic'";
		String updateQuery6="UPDATE MovieList set director='pavan vadeyar' WHERE name='Googly'";
		String updateQuery7="UPDATE MovieList set director='PAUL' WHERE name='Fast and Furious'";
		String updateQuery8="UPDATE MovieList set budget=10000000 WHERE name='Game of thrones'";
		String updateQuery9="UPDATE MovieList set  name='Vikram' WHERE director='Loki'";
		String deleteQuery="DELETE FROM MovieList WHERE name='Iron man'";

		
		try {
			Connection connect = DriverManager.getConnection(url, username, password);
			
			Statement stat=connect.createStatement();
			stat.execute(updateQuery);
			stat.execute(updateQuery1);
			stat.execute(updateQuery2);
			stat.execute(updateQuery3);
			stat.execute(updateQuery4);
			stat.execute(updateQuery5);
			stat.execute(updateQuery6);
			stat.execute(updateQuery7);
			stat.execute(updateQuery8);
			stat.execute(updateQuery9);
			stat.execute(deleteQuery);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
