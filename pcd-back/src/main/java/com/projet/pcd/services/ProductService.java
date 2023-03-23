package com.projet.pcd.services;


import com.projet.pcd.dao.ProductRepository;
import com.projet.pcd.model.Product;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductService {
    private ProductRepository pr;

    public void saveProduct(Product p, MultipartFile mf) {
        if (p.getId() == null) {
            p.setId(UUID.randomUUID().toString());
        }

        if (mf != null) {
            String nomPhoto = this.UploadPhoto(mf);
            p.setPhoto(nomPhoto);
        }

        this.pr.save(p);
    }

    public String UploadPhoto(MultipartFile mf) {
        String nom = mf.getOriginalFilename();
        String[] tab = nom.split("\\.");
        String nouveau = tab[0] + System.currentTimeMillis() + "." + tab[1];
        Path p = Paths.get(System.getProperty("user.home") + "/imagesarsii2022/", nouveau);

        try {
            Files.write(p, mf.getBytes(), new OpenOption[0]);
        } catch (IOException var7) {
        }

        return nouveau;
    }

    public byte[] getImage(String idproduit) {
        String nomPhoto = ((Product)this.pr.findById(Integer.valueOf(idproduit)).get()).getPhoto();
        String chemin = System.getProperty("user.home") + "/imagesarsii2022/";
        Path p = Paths.get(chemin, nomPhoto);

        try {
            return Files.readAllBytes(p);
        } catch (IOException var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public List<Product> getAllProducts() {
        return this.pr.findAll();
    }

    public Product getProduit(String idProduct) {
        return (Product)this.pr.findById(Integer.valueOf(idProduct)).get();
    }

    public List<Product> getProductsByCat(Integer idcat) {
        return this.pr.getProductsByCate(idcat);
    }

    public void deleteProduct(String idp) {
        this.pr.deleteById(Integer.valueOf(idp));
    }

    public ProductService(final ProductRepository pr) {
        this.pr = pr;
    }
}
