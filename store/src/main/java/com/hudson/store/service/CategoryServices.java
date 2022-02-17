package com.hudson.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hudson.store.model.entities.Category;
import com.hudson.store.repositories.CategoryRepository;

import DTO.CategoryDTO;

@Service
public class CategoryServices {

	@Autowired
	private CategoryRepository repository;
	
	
	public Category saveCategory (Category category) 
	{
		return repository.save(category);
	}
	
	public CategoryDTO findById(Long id) {
		Category entity =  repository.findById(id).get();
		CategoryDTO dto = new CategoryDTO(entity);
		return dto;
	}
}
