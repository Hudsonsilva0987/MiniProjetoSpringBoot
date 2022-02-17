package com.hudson.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hudson.store.model.entities.Product;
import com.hudson.store.repositories.ProductRepository;

import DTO.ProductDto;

@Service
public class ProductService {


	@Autowired
	private ProductRepository repository;
	
	public Product salvar(Product product) {
		return repository.save(product);
	}
	
	public ProductDto findById(Long id) {
		Product product = repository.findById(id).get();
		ProductDto dto = new ProductDto(product);
		return dto;
	}
}
