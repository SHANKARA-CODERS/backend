package com.example.demo;

import com.example.demo.entity.Shop;
import com.example.demo.entity.ShopDTO;

public class ShopMapper {
    public static Shop mapToEntity(ShopDTO dto) {
        Shop entity = new Shop();
        entity.setShopName(dto.getShopName());
        entity.setShopPhone(dto.getShopPhone());
        entity.setUsername(dto.getUsername());
        entity.setShopEmail(dto.getShopEmail());
        entity.setShopPhoto(dto.getShopPhoto());
        entity.setAddress(dto.getAddress());
        entity.setCoordinates(dto.getCoordinates());
        return entity;
    }
    
    public static ShopDTO mapToDTO(Shop entity) {
        ShopDTO dto = new ShopDTO();
        dto.setShopName(entity.getShopName());
        dto.setShopPhone(entity.getShopPhone());
        dto.setUsername(entity.getUsername());
        dto.setShopEmail(entity.getShopEmail());
        dto.setShopPhoto(entity.getShopPhoto());
        dto.setAddress(entity.getAddress());
        dto.setCoordinates(entity.getCoordinates());
        return dto;
    }
}
