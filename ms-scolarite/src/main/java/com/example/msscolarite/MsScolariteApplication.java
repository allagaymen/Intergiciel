package com.example.msscolarite;

import com.example.msscolarite.entities.Etablissement;
import com.example.msscolarite.entities.Etudiant;
import com.example.msscolarite.rep.EtablissementRep;
import com.example.msscolarite.rep.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class MsScolariteApplication implements CommandLineRunner {
    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    EtablissementRep etablissementRep;

    public static void main(String[] args) {
        SpringApplication.run(MsScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etablissement et1 = etablissementRep.save(new Etablissement(null, "esi-alger", null));
        Etablissement et2 = etablissementRep.save(new Etablissement(null, "esi-alger", null));

        Etudiant e1 = etudiantRep.save(new Etudiant(null,"mohammed",et1,1l,null));
        Etudiant e2 = etudiantRep.save(new Etudiant(null,"ahmed",et1,1l,null));
        Etudiant e3 = etudiantRep.save(new Etudiant(null,"ali",et1,2l,null));

    }
}