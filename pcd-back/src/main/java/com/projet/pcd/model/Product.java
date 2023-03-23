package com.projet.pcd.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



@Entity
public class Product {
    @Id
    private String Id;
    private String nom;
    private String photo;
    private double prix;
    private int quantite;
    private double prix_achat;
    @ManyToOne
    private Category categorie;

    public Product(String nom, double prix, Category categorie) {
    }

    public Product(String string, String nom2, int prix, int i, String string2, Category c1, int prixAchat) {
        this.Id = string;
        this.nom = nom2;
        this.prix = prix;
        this.quantite = i;
        this.photo = string2;
        this.categorie = c1;
        this.prix_achat = prixAchat;
    }

    public String getId() {
        return this.Id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPhoto() {
        return this.photo;
    }

    public double getPrix() {
        return this.prix;
    }

    public int getQuantite() {
        return this.quantite;
    }

    public double getPrix_achat() {
        return this.prix_achat;
    }

    public Category getCategorie() {
        return this.categorie;
    }

    public void setId(final String Id) {
        this.Id = Id;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public void setPhoto(final String photo) {
        this.photo = photo;
    }

    public void setPrix(final double prix) {
        this.prix = prix;
    }

    public void setQuantite(final int quantite) {
        this.quantite = quantite;
    }

    public void setPrix_achat(final double prix_achat) {
        this.prix_achat = prix_achat;
    }

    public void setCategorie(final Category categorie) {
        this.categorie = categorie;
    }


    public Product(final String Id, final String nom, final String photo, final double prix, final int quantite, final double prix_achat, final Category categorie) {
        this.Id = Id;
        this.nom = nom;
        this.photo = photo;
        this.prix = prix;
        this.quantite = quantite;
        this.prix_achat = prix_achat;
        this.categorie = categorie;
    }

    public Product() {
    }
}
