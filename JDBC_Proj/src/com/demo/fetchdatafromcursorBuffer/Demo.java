package com.demo.fetchdatafromcursorBuffer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		String query="select * from oece15jdbc.student where id=?";
		ResultSet rs=null;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter id??");
		int id=scn.nextInt();
		scn.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,id);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				String name=rs.getString(2);
				double perc=rs.getDouble(3);
				System.out.println(name+" "+perc);
			}
			else
			{
				System.err.println("No data found for id"+id);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	}
	}


