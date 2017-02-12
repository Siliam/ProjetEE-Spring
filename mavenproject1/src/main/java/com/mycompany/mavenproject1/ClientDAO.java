package com.mycompany.mavenproject1;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ClientDAO extends CrudRepository<Client, Long> {
    List<Client> findAllByOrderByNomAsc();
    List<Client> findByNomAndPrenom(String nom , String prenom);
}
