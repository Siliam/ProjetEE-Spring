package com.mycompany.spring.data.demo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ClientDAO extends CrudRepository<Client, Long> {
    List<Client> findAllByOrderByPrenomAsc();
    List<Client> findByPrenomIgnoreCase(String nom);
    List<Client> findByNomAndPrenom(String nom, String prenom);
    List<Client> findAllByOrderByNomAsc();
}
