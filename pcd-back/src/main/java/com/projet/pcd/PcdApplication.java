package com.projet.pcd;

import com.projet.pcd.dao.CategoryRepository;
import com.projet.pcd.model.Category;
import com.projet.pcd.model.Product;
import com.projet.pcd.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class PcdApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcdApplication.class, args);



	}
}
