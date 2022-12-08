package com.example.TP1_.Modele;


import lombok.Data;


@Data

public class Module {
    private int id;
    private String nom;
    private String description;

    public Module() {

    }

    public Module(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }
}