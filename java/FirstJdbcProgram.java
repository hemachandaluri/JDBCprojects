package com.jdbctraining.java;
import java.sql.*;
public class FirstJdbcProgram {
	public static void main(String[] args) {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); //loading the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/motelproject","root","Hema1993"); //invoke the connection
			Statement stmt = con.createStatement(); //get the statement
			ResultSet rs = stmt.executeQuery("select * from guest"); //get the datat from DB
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ "\t" + rs.getString(2)+ "\t" + rs.getString(3)
				+ "\t" + rs.getString(4)+ "\t" + rs.getString(5)+ "\t" +rs.getInt(6)+ 
				"\t" +rs.getFloat(7));
			}
			System.out.println("Values in Guest Table");
				
	}catch (Exception e) {
		e.printStackTrace();	
	}finally {
		try {
			if(con!= null)
				con.close(); //close the connection
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	}
}
	

	
	
