package com.demo.insertApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbcDemo1 {

		public static void main(String[] args) {
			
			Connection con=null;
			Statement stmt=null;
			String inqry="insert into oece15jdbc.student values(1,'Ram',68.22)";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver class loaded and registered");
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				System.out.println("connection establish with db server");
				
				stmt=con.createStatement();
				System.out.println("platfrom created");
				
				stmt.executeUpdate(inqry);
				System.out.println("Data inserted!!");
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			finally {
				if(stmt !=null)
					
				{
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(con !=null)
				{
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println("close all costly resources.");
			}
		

}}
