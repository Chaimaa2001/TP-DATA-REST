package com.example.tpdatarest.dtos;

import com.example.tpdatarest.enums.Genre;

public record EtudiantDTO (
    String nom,
    String prenom,
    Genre genre,
    Long centreId
){
}
