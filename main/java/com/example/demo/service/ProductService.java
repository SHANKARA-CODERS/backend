package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;


	public ResponseEntity<List<Product>> getAll() {
		return new ResponseEntity<List<Product>>(productRepo.findAll(), HttpStatus.OK);
	}

	public ResponseEntity<List<Product>> getAllBySubcategoryId(int id) {
		return new ResponseEntity<List<Product>>(productRepo.findBySubcategory_SubcategoryId(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Product>> getAllByCategoryId(String category) {
		if(category.equals("groceries")) {
			return new ResponseEntity<List<Product>>(productRepo.findBySubcategory_Category_CategoryId(1), HttpStatus.OK);
		}
		else if(category.equals("electronics")) {
			return new ResponseEntity<List<Product>>(productRepo.findBySubcategory_Category_CategoryId(2), HttpStatus.OK);
		}
		else if(category.equals("fashion")) {
			return new ResponseEntity<List<Product>>(productRepo.findBySubcategory_Category_CategoryId(3), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<Product>>(HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<Product> getProductByProductId(int id) {
		return new ResponseEntity<Product>(productRepo.findProductByProductId(id), HttpStatus.OK);
	}

//	public ResponseEntity<List<Product>> getProductByCategoryAndSubcategory(String cat1, String cat2) {
//		return new ResponseEntity<List<Product>>(productRepo.findBySubcategory_Category_CategoryNameAndSubcategory_SubcategoryName(cat1, cat2), HttpStatus.OK);
//	}
	
	
}
