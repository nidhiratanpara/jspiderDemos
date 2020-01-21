package com.demo.featchperticularrecoedcursorbuffer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DemofetchperticlularRecord {
	
		
		public static void main(String[] args) {
			
			Connection con=null;
			PreparedStatement pstmt=null;
			String query="select * from oece15jdbc.student where name=?";
			ResultSet rs=null;
			Scanner scn=new Scanner(System.in);
			System.out.println("enter name??");
			String sname=scn.next();
			scn.close();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("class loaded");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				pstmt=con.prepareStatement(query);
				pstmt.setString(1,sname);
				rs=pstmt.executeQuery();
				if(rs.next())
				{
					int id=rs.getInt(1);
					double perc=rs.getDouble(3);
					System.out.println(id+" "+perc);
				}
				else
				{
					System.err.println("No data found for id"+sname);
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