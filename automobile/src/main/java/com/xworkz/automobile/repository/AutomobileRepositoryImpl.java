package com.xworkz.automobile.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.automobile.dto.VehicleDTO;

public class AutomobileRepositoryImpl implements AutomobileRepository {

	public AutomobileRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	public void saveVehicleDetails(VehicleDTO vehicleDTO) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3308/automobile";
		String username = "root";
		String password = "9008@Darshan";

		String query = "INSERT INTO vehicle(name,color,type,model) VALUES(?,?,?,?)";

		try {

			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vehicleDTO.getName());
			pstmt.setString(2, vehicleDTO.getColor());
			pstmt.setString(3, vehicleDTO.getType());
			pstmt.setInt(4, vehicleDTO.getModel());
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void saveVehicleDetails(List<VehicleDTO> vechicledListDTO) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3308/automobile";
		String username = "root";
		String password = "9008@Darshan";

		String query1 = "INSERT INTO vehicle(name,color,type,model) VALUES(?,?,?,?)";

		try {

			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt1 = conn.prepareStatement(query1);
			for (VehicleDTO dto1 : vechicledListDTO) {
				pstmt1.setString(1, dto1.getName());
				pstmt1.setString(2, dto1.getColor());
				pstmt1.setString(3, dto1.getType());
				pstmt1.setInt(4, dto1.getModel());
				pstmt1.execute();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateVehicleDetails(VehicleDTO vehicleDTO) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3308/automobile";
		String username = "root";
		String password = "9008@Darshan";

		String query2 = "UPDATE vehicle SET color=?, model=? WHERE name=?";

		try {
			Connection connect = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt2 = connect.prepareStatement(query2);
			pstmt2.setString(1, vehicleDTO.getColor());
			pstmt2.setInt(2, vehicleDTO.getModel());
			pstmt2.setString(3, vehicleDTO.getName());
			pstmt2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateVehicleDetails(List<VehicleDTO> vechicleListDTO) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3308/automobile";
		String username = "root";
		String password = "9008@Darshan";

		String query3 = "UPDATE vehicle SET color=?, model=? WHERE name=?";

		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt3 = conn.prepareStatement(query3);
			for (VehicleDTO dto2 : vechicleListDTO) {

				pstmt3.setString(1, dto2.getColor());
				pstmt3.setInt(2, dto2.getModel());
				pstmt3.setString(3, dto2.getName());
				pstmt3.executeUpdate();

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<VehicleDTO> fetchAllDetails() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3308/automobile";
		String username = "root";
		String password = "9008@Darshan";
		
		String query2="SELECT * FROM vehicle";
		List<VehicleDTO> vehicle=new ArrayList<VehicleDTO>();

		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt4 = conn.prepareStatement(query2);
			ResultSet res=pstmt4.executeQuery();
			
			while(res.next()) {
				VehicleDTO dto=new VehicleDTO();
				dto.setModel(res.getInt("model"));
				dto.setColor(res.getString("color"));
				dto.setName(res.getString("name"));
				dto.setType(res.getString("type"));
				vehicle.add(dto);
					
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vehicle;
	}
}
