package com.example.msformation;

import com.example.msformation.entities.Formation;
import com.example.msformation.rep.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner {

    @Autowired
    FormationRep formationRep;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Formation f1 = formationRep.save(new Formation(null, "Intergiciel", 6));
        Formation f2 = formationRep.save(new Formation(null, "Réseaux", 4));
        Formation f3 = formationRep.save(new Formation(null, "web", 6));

    }}
