package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

	Object findByProductId(Long id);

	List<Product> findBySubcategory_SubcategoryId(int id);

	List<Product> findBySubcategory_Category_CategoryId(int categoryId);

	Product findProductByProductId(int id);
	
//	List<Product> findBySubcategory_Category_CategoryNameAndSubcategory_SubcategoryName(String categoryName, String subcategoryName);
	

}
