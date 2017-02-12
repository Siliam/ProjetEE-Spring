package com.mycompany.mavenproject1;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String prenom;
    private String nom;

    public Client() {
    }

    public Client(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
    
    @Override
    public String toString() {
        return String.format("  Client [#%d] : %s %s", id, nom, prenom);
    }
}
