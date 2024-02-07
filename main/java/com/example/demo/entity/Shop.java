package com.example.demo.entity;
import java.awt.Point;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRawValue;

import jakarta.persistence.*;

@Entity
@Table(name = "Shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "shop_phone")
    private String shopPhone;

    @Column(name = "username")
    private String username;

    @Column(name = "shop_email")
    private String shopEmail;

    @Column(name = "shop_photo")
    private String shopPhoto;

    @Column(name = "address")
    private String address;
    
    @Column(name = "coordinates")
    private String coordinates;

    
    @OneToMany(mappedBy = "shop")
    private List<ShopProduct> shopProducts;

	public List<ShopProduct> getShopProducts() {
		return shopProducts;
	}

	public void setShopProducts(List<ShopProduct> shopProducts) {
		this.shopProducts = shopProducts;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopPhone() {
		return shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getShopEmail() {
		return shopEmail;
	}

	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}

	public String getShopPhoto() {
		return shopPhoto;
	}

	public void setShopPhoto(String shopPhoto) {
		this.shopPhoto = shopPhoto;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	
    // Getters and setters
}