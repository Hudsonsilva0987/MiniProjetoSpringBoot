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

import com.hudson.store.model.entities.Category;
import com.hudson.store.service.CategoryServices;

import DTO.CategoryDTO;


@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryServices service;

	@PostMapping
	public ResponseEntity<Category> save(@RequestBody Category category) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.saveCategory(category));
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.findById(id));
	}
}
