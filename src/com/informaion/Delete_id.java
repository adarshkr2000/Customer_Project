package com.informaion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_id {

	public void Remove_id() throws SQLException{
		Connection con = MyConnections.createCon();
		Scanner sc2=new Scanner(System.in);
		String id;
		System.out.println("Enter id to be deleted: ");
		id=sc2.next();
		String q2="delete from Customer where C_id=?";
 		PreparedStatement pstmt2=con.prepareStatement(q2);
 		pstmt2.setString(1,id);
 		pstmt2.execute();
 		System.out.println("\nDeleted Successful \n");

	}

}
