package com.hudson.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hudson.store.model.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
