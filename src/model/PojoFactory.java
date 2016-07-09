package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PojoFactory {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/order_fact";
       //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "password";// JDBC driver name and database URL
	   
	   Connection conn = null;
	   Statement stmt = null;
	   
	    public PojoFactory(){}
		   
	  
	    
	   public Statement stmt(){
		     try {
		    	   Class.forName("com.mysql.jdbc.Driver");
				   System.out.println("Connecting to database...");
			       conn = DriverManager.getConnection(DB_URL,USER,PASS);
			       return stmt = conn.createStatement();
			   }  catch (ClassNotFoundException | SQLException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
			 }
			return stmt;
	   
	   }
	   
	 public void destroy(){
		  try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }  
	   
	   
	   

}
