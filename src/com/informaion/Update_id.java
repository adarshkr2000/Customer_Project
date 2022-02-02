package com.informaion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_id {
	public void Edit() throws SQLException{
		Connection con = MyConnections.createCon();
		Scanner sc =new Scanner(System.in);
		String Id;
		System.out.println("Enter Id to be Updated: ");
		Id=sc.next();
		System.out.println("Enter Name to be Updated: ");
		String name=sc.next();
		String q3="UPDATE Customer Set Cname=? where C_id=?";
		PreparedStatement pstmt3=con.prepareStatement(q3);
		pstmt3.setString(1,name);
		pstmt3.setString(2,Id);
 		pstmt3.execute();
 		System.out.println("\nUpdated Successful \n");
	}
}
