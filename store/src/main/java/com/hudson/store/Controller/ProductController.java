package com.hudson.store.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.hudson.store.model.entities.Product;
import com.hudson.store.service.ProductService;

import DTO.ProductDto;

@RestController
@RequestMapping("/products")
public class ProductController {

	
	@Autowired
	private ProductService service;
	
	@PostMapping
	public ResponseEntity<Product> inserir (@RequestBody Product product){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.salvar(product));
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.findById(id));
	}
}
