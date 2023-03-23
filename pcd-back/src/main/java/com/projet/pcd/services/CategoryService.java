package com.projet.pcd.services;

import com.projet.pcd.dao.CategoryRepository;
import com.projet.pcd.model.Category;
import com.projet.pcd.model.Product;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

public class CategoryService implements CategoryInterfaceService {
    private CategoryRepository cc;

    public Category save(Category c) {
        return this.cc.save(c);
    }

    public List<Category> getAllCategories() {
        return this.cc.findAll();
    }

    public void deleteCategorie(Integer i) {
        Category c = this.getCategory(i);
        List<Product> l = c.getProduits();
        Iterator<Product> var5 = l.iterator();

        while(var5.hasNext()) {
            Product p = var5.next();
            p.setCategorie(null);
        }

        this.cc.delete(c);
    }

    public Category getCategory(Integer idc) {
        return this.cc.findById(idc).get();
    }

    public CategoryService(final CategoryRepository cc) {
        this.cc = cc;
    }
}
