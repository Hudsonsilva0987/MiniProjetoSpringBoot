package com.hudson.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hudson.store.model.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
