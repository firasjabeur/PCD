package com.projet.pcd.services;

import com.projet.pcd.model.Category;
import java.util.List;

public interface CategoryInterfaceService {
    List<Category> getAllCategories();

    Category save(Category c);

    void deleteCategorie(Integer i);

    Category getCategory(Integer idc);
}
