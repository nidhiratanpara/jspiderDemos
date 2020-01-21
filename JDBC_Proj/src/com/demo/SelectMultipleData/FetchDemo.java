package com.demo.SelectMultipleData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchDemo {
	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			String strqry="select * from oece15jdbc.student where id=12";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver classes loaded and registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
	    	System.out.println("Connection establish with DBserver");
	    	pstmt=con.prepareStatement(strqry);
	    	System.out.println("platform created");
	    	rs=pstmt.executeQuery();
	    	System.out.println("Data Featched");
	    	
	    	 if (rs.next()) {
           // while(rs.next()) {
	        int id=rs.getInt("id");
	        String name=rs.getString(2);
	        Double perc=rs.getDouble(3);
	        System.out.println(id+" "+name+" "+perc);
            }
	    	
	    	
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt !=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} 
		}
	}

}
