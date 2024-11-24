package com.example.tpdatarest.models;

import com.example.tpdatarest.enums.Genre;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
@Builder
@Table(name="etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nom_etudiant",nullable = false)
    private String nom;
    @Column(name="prenom_etudiant")
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @ManyToOne
    @NonNull
    @JoinColumn(name = "centre_id")
    private Centre centre;

}
