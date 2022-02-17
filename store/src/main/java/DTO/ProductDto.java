package DTO;

import com.hudson.store.model.entities.Product;

public class ProductDto {
	
	private String name;
	
	private Double price;
	
	
	public ProductDto(Product product) {
		name = product.getName();
		price = product.getPrice();
	}
	
	public ProductDto(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
