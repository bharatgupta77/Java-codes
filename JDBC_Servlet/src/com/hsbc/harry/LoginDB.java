package com.hsbc.harry;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoginDB {
	
	DBConnection db=new DBConnection();
	
	
	public void insertUser(String username,String password) {
		
		try {
			PreparedStatement ps = db.getPreparedStatement("insert into harry values(?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	public List  getUsers() {
		
		// TODO Auto-generated method stub
		List l=new ArrayList();
		try {
			Statement st=db.getStatement();
			ResultSet rs=st.executeQuery("Select * from harry");
			while(rs.next())
			{
				l.add(rs.getString(1)+" "+rs.getString(2));
				
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return l;
	}
	
	

}
