package com.example.msscolarite.rep;

import com.example.msscolarite.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRep extends JpaRepository<Etablissement, Long> {
}
