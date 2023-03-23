package com.projet.pcd.controllers;

import com.projet.pcd.services.CategoryService;
import com.projet.pcd.model.Category;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin({"*"})
@RestController
@RequestMapping({"/apicategory"})
public class CategoryController {
    CategoryService sc;

    public CategoryController(CategoryService sc) {
        this.sc = sc;
    }

    @GetMapping({"/all"})
    public List<Category> getAllCategories() {
        return this.sc.getAllCategories();
    }

    @PostMapping({"/add"})
    public Category ajouterCategorie(@RequestBody Category c) {
        Category newCategory = this.sc.save(c);
        return newCategory;
    }

    @DeleteMapping({"/del/{id}"})
    public void supprimerCategorie(@PathVariable Integer id) {
        this.sc.deleteCategorie(id);
    }

    @GetMapping({"/catgorieById/{id}"})
    public Category getCategory(@PathVariable Integer id) {
        return this.sc.getCategory(id);
    }
}

