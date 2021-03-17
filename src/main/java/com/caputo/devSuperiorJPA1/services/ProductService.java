package com.caputo.devSuperiorJPA1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caputo.devSuperiorJPA1.entities.Product;
import com.caputo.devSuperiorJPA1.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
}
