package com.projet.pcd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projet.pcd.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
