package com.jdbctraining.insert.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {

		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); //loading the driver
			System.out.println("Connecting to a selected database...");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_motelproject","root","Hema1993");//invoke the connection
			System.out.println("Connected database successfully...");

			System.out.println("Inserting data into table in given database");
			Statement stmt = con.createStatement(); //get the statement
			String sql = "INSERT INTO category(category_id, bed_type, rooms, bathroom, private_pool, mini_kitchen, default_number_of_guests, "
					+ "price, price_additional_guests, balcony, shared_room, enable)"
					+ "VALUES (101,'twin',1, 2,1,1,2, 10.99, 3.99, 1, 1,1)";
			stmt.execute(sql);
			String sql1 = "INSERT INTO category(category_id, bed_type, rooms, bathroom, private_pool, mini_kitchen, default_number_of_guests, "
					+ "price, price_additional_guests, balcony, shared_room, enable)"
					+ "VALUES (102,'king',1, 2,1,1,2, 20.99, 3.99, 1, 1,1)";
			stmt.execute(sql1);
			String sql2 = "INSERT INTO category(category_id, bed_type, rooms, bathroom, private_pool, mini_kitchen, default_number_of_guests, "
					+ "price, price_additional_guests, balcony, shared_room, enable)"
					+ "VALUES (103,'queen',1, 2,1,1,2, 30.99, 3.99, 1, 1,1)";
			stmt.execute(sql2);
			String sql3 = "INSERT INTO category(category_id, bed_type, rooms, bathroom, private_pool, mini_kitchen, default_number_of_guests, "
					+ "price, price_additional_guests, balcony, shared_room, enable)"
					+ "VALUES (104,'shared_bed',1, 2,1,1,2, 10.99, 3.99, 1, 1,1)";
			stmt.execute(sql3);
			String sql4 = "INSERT INTO category(category_id, bed_type, rooms, bathroom, private_pool, mini_kitchen, default_number_of_guests, "
					+ "price, price_additional_guests, balcony, shared_room, enable)"
					+ "VALUES (105,'bunk_bed',1, 2,1,1,2, 5.99, 3.99, 1, 1,1)";
			stmt.execute(sql4);
		
			System.out.println("Data has been inserted into category tabel");//inserting data into table
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