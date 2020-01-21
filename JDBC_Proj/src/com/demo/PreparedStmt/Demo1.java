package com.demo.PreparedStmt;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Demo1 {
	
			public static void main(String[] args) {
				
				Connection con=null;
				PreparedStatement pstmt=null;
				String inqry="insert into oece15jdbc.student values(?,?,?)";
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver class loaded and registered");
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
					System.out.println("connection establish with db server");
					
					pstmt=con.prepareStatement(inqry);
					System.out.println("platfrom created");
					pstmt.setInt(1,13);
					pstmt.setString(2,"Vasu");
					pstmt.setDouble(3,83.22);
					pstmt.executeUpdate();
					
					pstmt.setInt(1,14);
					pstmt.setString(2,"Krishna");
					pstmt.setDouble(3,73.22);
					pstmt.executeUpdate();
					
					System.out.println("Data's inserted!!");
					
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
				finally {
					if(pstmt !=null)
						
					{
						try {
							pstmt.close();
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
