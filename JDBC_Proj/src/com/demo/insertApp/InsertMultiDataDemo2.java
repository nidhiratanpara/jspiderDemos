package com.demo.insertApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMultiDataDemo2 {
	
			public static void main(String[] args) {
				
				Connection con=null;
				Statement stmt=null;
				String inqry1="insert into oece15jdbc.student values(6,'Ram',68.22)";
				String inqry2="insert into oece15jdbc.student values(7,'Raja',78.22)";
				String inqry3="insert into oece15jdbc.student values(8,'Kiran',88.22)";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver class loaded and registered");
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
					System.out.println("connection establish with db server");
					
					stmt=con.createStatement();
					System.out.println("platfrom created");
					
					stmt.executeUpdate(inqry1);
					stmt.executeUpdate(inqry2);
					stmt.executeUpdate(inqry3);
					System.out.println("Data's inserted!!");
					
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
				
			

	}}

}
