package com.projet.pcd.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;


@Entity
public class Category {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;
    private String nom;
    @OneToMany(
            mappedBy = "categorie"
    )
    @JsonProperty(
            access = Access.WRITE_ONLY
    )
    private List<Product> produits;

    public Category(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public List<Product> getProduits() {
        return this.produits;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    @JsonProperty(
            access = Access.WRITE_ONLY
    )
    public void setProduits(final List<Product> produits) {
        this.produits = produits;
    }

    public Category(final Integer id, final String nom, final List<Product> produits) {
        this.id = id;
        this.nom = nom;
        this.produits = produits;
    }

    public Category() {
    }
}