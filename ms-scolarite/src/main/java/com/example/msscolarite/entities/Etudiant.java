package com.example.msscolarite.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    @Column(nullable = false)
    private String nom;
    @ManyToOne
    private Etablissement etab;
    private Long idFormation;
    @Transient
    private Formation formation;
}
