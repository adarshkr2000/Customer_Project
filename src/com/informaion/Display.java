package com.informaion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Display {
	public void  Show() throws SQLException {
	String q4="SELECT * FROM Customer";
	Connection con = MyConnections.createCon();
	PreparedStatement pstmt=con.prepareStatement(q4);
	ResultSet set=pstmt.executeQuery(q4);


	while(set.next()) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Customer Id: "+ set.getString("C_id"));
		System.out.println("Customer Name: "+ set.getString("Cname"));
		System.out.println("Customer Age: "+ set.getString("C_age"));
		System.out.println("Customer City: "+ set.getString("C_city"));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
  }
}
