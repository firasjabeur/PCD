package com.projet.pcd.services;


import com.projet.pcd.model.Product;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface ProductInterfaceService {
    void saveProduct(Product p, MultipartFile mf);

    String UploadPhoto(MultipartFile mf);

    byte[] getImage(String idproduit);

    List<Product> getAllProducts();

    Product getProduit(String idProduct);

    List<Product> getProductsByCat(Integer idcat);

    void deleteProduct(String idp);
}
