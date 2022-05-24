package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.repository.CartRepository;

import java.util.List;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepository;
	
	public Cart addToCart(Cart cart)
	{
		return cartRepository.save(cart);
	}
	
	public  List<Cart> getCartDetailsByUserId(int userId)
	{
		return cartRepository.findByUserId(userId);
	}
}
