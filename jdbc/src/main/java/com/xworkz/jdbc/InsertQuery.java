package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

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
		
		String query="INSERT INTO MovieList(id,name,director,budget) VALUES(1,'KGF','Prashanth neel',5000000)";
		String query1="INSERT INTO MovieList(id,name,director,budget) VALUES(2,'Vikranth rona','Sudeep',8000000)";
		String query2="INSERT INTO MovieList(id,name,director,budget) VALUES(3,'Fast and Furious','Dwayne Johnson',12000000)";
		String query3="INSERT INTO MovieList(id,name,director,budget) VALUES(4,'KGF2','Prashanth neel',5500000)";
		String query4="INSERT INTO MovieList(id,name,director,budget) VALUES(5,'Googly','pavan',8090000)";
		String query5="INSERT INTO MovieList(id,name,director,budget) VALUES(6,'Game of thrones',' Johnson',11000000)";
		String query6="INSERT INTO MovieList(id,name,director,budget) VALUES(7,'Ugram','Prashanth neel',1208000)";
		String query7="INSERT INTO MovieList(id,name,director,budget) VALUES(8,'Jailer','Loki',5508000)";
		String query8="INSERT INTO MovieList(id,name,director,budget) VALUES(9,'Titanic','Darshan musale ',809000000)";
		String query9="INSERT INTO MovieList(id,name,director,budget) VALUES(10,'Iron man',' Rohan mesta',11008000)";


		
		try {
			 Connection connect = DriverManager.getConnection(url, username, password);
			Statement stat = connect.createStatement();
			stat.execute(query);
			stat.execute(query1);
			stat.execute(query2);
			stat.execute(query3);
			stat.execute(query4);
			stat.execute(query5);
			stat.execute(query6);
			stat.execute(query7);
			stat.execute(query8);
			stat.execute(query9);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
