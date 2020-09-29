package com.hsbc.harry;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	Connection con;
	Statement st;
	PreparedStatement pst;

	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		try {
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3308/user?characterEncoding=latin1&useConfigs=maxPerformance","root","1234567Q");
			System.out.println("connection succesfull");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}

	public PreparedStatement getPreparedStatement(String sql) {
		// TODO Auto-generated method stub
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3308/user?characterEncoding=latin1&useConfigs=maxPerformance","root","1234567Q");
			pst = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pst;
		
	}

	
}