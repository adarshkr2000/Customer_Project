package com.informaion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Add_data {
	
		public void Make_Customer_id() throws SQLException {
			
			Connection con = MyConnections.createCon();
			Scanner sc1 =new Scanner(System.in);
			System.out.println("Enter Name of Customer: ");
			String name=sc1.nextLine();
			
			System.out.println("Enter age of Customer: ");
			String age=sc1.nextLine();
			
			System.out.println("Enter city: ");
			String city=sc1.nextLine();
			
			String q="Insert into Customer(Cname,C_age,C_city) VALUES(?,?,?)";
	        PreparedStatement pstmt=con.prepareStatement(q);
	        try {
	            pstmt.setString(1,name);
		        pstmt.setString(2,age);
		        pstmt.setString(3,city);
		        pstmt.execute();
	        	
	        }catch(SQLException e) {
	        	e.printStackTrace();
	        }
	   
	        System.out.println("\nAdded Successful \n");
			
		}
	}

