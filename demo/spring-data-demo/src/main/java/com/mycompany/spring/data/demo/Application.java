package com.mycompany.spring.data.demo;

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
            // Début
            System.out.println("\n\n\n\n\nBonjour !\n");
            
            dao.save(new Client("Ali", "Alami"));
            dao.save(new Client("Rida", "Tijani"));
            dao.save(new Client("Walid", "Lahlou"));
            dao.save(new Client("Karim", "Rochdi"));
            dao.save(new Client("Samira", "Bennani"));
            dao.save(new Client("Widad", "Bennani"));
            
            // Renvoyer tous les clients
            Iterable<Client> clients = dao.findAllByOrderByNomAsc();
            System.out.println("Clients retournés par findAll():");
            System.out.println("--------------------------------");
            for (Client c : clients) 
                System.out.println(c);
            
            
            
            System.out.println("\n\n\n\n\n\n");
        };
    }
}
