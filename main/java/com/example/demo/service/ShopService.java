package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Shop;
import com.example.demo.repository.ShopRepo;

@Service
public class ShopService {
	@Autowired
	ShopRepo repo;

	public ResponseEntity<String> save(Shop shop) {
		try {
			repo.save(shop);
			return new ResponseEntity<String>("Data stored succesfully", HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Something went Wrong", HttpStatus.BAD_REQUEST);
	}

}
