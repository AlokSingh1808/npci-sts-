package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/prodList")
	public List<Product> findAll(){
		
		return prodService.findAll();
	}
	
	@GetMapping("/prodList/Id")
	public List<Product> GetById(int id){
		
		return prodService.findAll();
	}

	@GetMapping("/prod/{id}")
	public Product findById(@PathVariable Integer id) throws Exception {
		Product p = prodService.findById(id);

		if (p == null)
			throw new Exception("Product ID : " + id + " details not available in Repository..");

		return p;
	}

	@PostMapping("/saveProduct")
	public String saveEmployee(@RequestBody Product prod) {
		prod.setId(0);
		prodService.saveOrUpdate(prod);

		return "Product details added successfully!!!";
	}

	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Product prod) throws Exception {
	
		
		prodService.saveOrUpdate(prod);
		
		return "Product ID : "+ prod.getId() + " Details updated Succesfully !!"; 
	}

	@DeleteMapping("prod/{id}")
	public String deleteById(@PathVariable int id) {
		prodService.deleteById(id);
		return "Product ID : " + id +"details  deleted !!!";
	}
	
}
