package com.example.msscolarite.APIs;

import com.example.msscolarite.entities.Etudiant;
import com.example.msscolarite.rep.EtudiantRep;
import com.example.msscolarite.rep.FormationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    FormationProxy formationProxy;
    @Autowired
    EtudiantRep etudiantRep;
    @GetMapping("etudiant/{id}")
    public Etudiant getEtudiant(@PathVariable("id") Long id){
        Etudiant e=etudiantRep.findById(id).get();
        e.setFormation(formationProxy.getF(e.getIdFormation()));
        return e;
    }
}
