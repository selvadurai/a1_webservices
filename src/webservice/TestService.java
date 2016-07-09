package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.Product;

@WebService
public class TestService {

	@WebMethod
	 public Product getProduct() {
	        Product product=new Product(1,"Brick");
	        return product;
     }


	

}
