package model;

import java.sql.*;    


public class Test {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/order_fact";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "password";// JDBC driver name and database URL
	  
	   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		      try {
		    	  
				Class.forName("com.mysql.jdbc.Driver");
				  System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
	   }	   
}
	   