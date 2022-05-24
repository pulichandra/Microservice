package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import com.example.demo.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{
	
	List<Cart> findByUserId(int userId);
}
