package com.demo.getandset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GetterandSetterData {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt;
		
		String qry="select * from  oece15.student where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			    pstmt=con.prepareStatement(qry);
			  
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
