package com.example.tpdatarest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Centre {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nom_Centre;
    private String adresse;
    @OneToMany(mappedBy = "centre",fetch = FetchType.LAZY)
    List<Etudiant>etudiants;


}
