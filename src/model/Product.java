package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Product")
public class Product {
   
	private int id;
	private String name;

	public Product(){
	   
	}
	
	public Product(int Vid, String Vname){
		id=Vid;
		name=Vname;
	}
	
	
	@XmlElement(name="ProductID")
	public int getProductId() {
         return id;        
	}
	
	@XmlElement(name="ProductName")
	public String getProductName() {
         return name;	
	}
	
	
}
