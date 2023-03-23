package com.projet.pcd.dao;

import com.projet.pcd.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("select p from Product p where p.categorie.id=:x")
    List<Product> getProductsByCate(@Param("x") Integer cat);
}
