package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ShopMapper;
import com.example.demo.entity.Product;
import com.example.demo.entity.Shop;
import com.example.demo.entity.ShopDTO;
import com.example.demo.service.ProductService;
import com.example.demo.service.ShopService;

@RestController
public class ProductController {
	@Autowired
	ProductService productservice;
	
	@Autowired
	ShopService shopService;
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> getAllProduct(){
		return productservice.getAll();
	}
	@GetMapping("/{category}")
	public ResponseEntity<List<Product>> getAllProductByCategoryId(@PathVariable("category") String category){
		return productservice.getAllByCategoryId(category);
	}
	
	@GetMapping("/{category}/{product_id}")
	public ResponseEntity<List<Product>>  getProductBySubcaategory(@PathVariable("product_id") int id){
		return productservice.getAllBySubcategoryId(id);
	}
	@GetMapping("/{category}/{subcategory}/{product_id}")
	public ResponseEntity<Product> getProduct(@PathVariable("product_id") int id){
		return productservice.getProductByProductId(id);
	}
	@GetMapping("/shops/{username}")
	public ResponseEntity<List<Product>> getProductByUsername(@PathVariable("username") String username){
		return productservice.getProductByUsername(username);
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveSeller(@RequestBody ShopDTO shopDTO) {
	    Shop shopEntity = ShopMapper.mapToEntity(shopDTO);
	    return shopService.save(shopEntity);
	}
}
