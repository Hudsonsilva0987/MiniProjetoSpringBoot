package DTO;

import com.hudson.store.model.entities.Category;

public class CategoryDTO {
	
	
	private String nome;
	
	
	public CategoryDTO(Category category) {
		nome = category.getName();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
