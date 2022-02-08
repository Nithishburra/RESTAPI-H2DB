package com.Test.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Test.Repository.ProductRepository;
import com.Test.binding.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productrepo;
	
	@PostMapping(value= "/product",consumes= "application/json")
	public ResponseEntity<String> productdeatils(@RequestBody Product product){
		     Product save = productrepo.save(product);
		     String msg = "record inserted";
		     return new ResponseEntity<>(msg,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/info",produces = "application/json")
	 public ResponseEntity<List<Product>> Getproducts(){
		 List<Product> products = productrepo.findAll();
		 return new ResponseEntity<>(products ,HttpStatus.OK);
	 }
}
