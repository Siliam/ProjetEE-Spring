package com.mycompany.spring.data.demo;

import javax.persistence.*;

@Entity     // Entité JPA
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String prenom;
    private String nom;

    protected Client() {}
    
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return String.format("  Client [#%d] : %s %s", id, nom, prenom);
    }
}
