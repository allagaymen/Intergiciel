package com.example.msscolarite.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EtablissementId;
    @Column(nullable = false)
    private String nom;
    @OneToMany(mappedBy = "etab")
    @JsonIgnore
    private List<Etudiant> etudiants;
}

