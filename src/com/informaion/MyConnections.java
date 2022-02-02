package com.informaion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyConnections {
	static Connection con;
	public static Connection createCon(){
		Connection con =null;
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Info";
			String user="root";
			String password ="tiger";
			
		    con =  DriverManager.getConnection(url,user,password);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
		
	}

}
