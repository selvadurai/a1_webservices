package controller;

import java.sql.Statement;
import java.util.ArrayList;

import model.PojoFactory;
import model.Product;

public class CreateListObjects implements ListSaleObjects{
   
	private ArrayList<Product> productList = new ArrayList<Product>(); 
	
	
	@Override 
	public ArrayList<Product> getProducts(){
	   PojoFactory pf=new PojoFactory();
	   Statement statment=pf.stmt();
		
	   return productList;
	}
	

}
