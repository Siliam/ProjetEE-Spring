package com.mycompany.mavenproject1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
    
    @Bean
    public CommandLineRunner demo(ClientDAO dao) {
        return (args) -> {
            System.out.println("\n\n\n\n\n\n");
            
            dao.save(new Client("Ali", "Alami"));
            dao.save(new Client("Rida", "Tijani"));
            dao.save(new Client("Walid", "Lahlou"));
            dao.save(new Client("Karim", "Rochdi"));
            dao.save(new Client("Samira", "Bennani"));
            dao.save(new Client("Widad", "Bennani"));
            
            // Renvoyer tous les clients
            Iterable<Client> clients = dao.findAll();
            System.out.println("Clients retournés par findAll():");
            System.out.println("--------------------------------");
            for (Client c : clients) 
                System.out.println(c);

            System.out.println("");
            
            // Chercher un client par nom et prénom
            Iterable<Client> clientsOrd = dao.findAllByOrderByNomAsc();
            System.out.println("Clients par ordre alphabétique : ");
            System.out.println("--------------------------------");
            for (Client c : clientsOrd) 
                System.out.println(c);

            // Chercher un client par nom et prénom
            Iterable<Client> clientsNomPrenom = dao.findByNomAndPrenom("Alami", "Ali");
            System.out.println("Clients dont le nom complet est 'Alami Ali' : ");
            System.out.println("----------------------------------------------");
            for (Client c : clientsNomPrenom) 
                System.out.println(c);

            System.out.println("");

            
            System.out.println("\n\n\n\n\n\n");
        };
    }
}
