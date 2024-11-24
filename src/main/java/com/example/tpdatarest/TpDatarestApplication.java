package com.example.tpdatarest;

import com.example.tpdatarest.enums.Genre;
import com.example.tpdatarest.models.Centre;
import com.example.tpdatarest.models.Etudiant;
import com.example.tpdatarest.repositories.CentreRepository;
import com.example.tpdatarest.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TpDatarestApplication implements CommandLineRunner {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(TpDatarestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Centre c1=Centre.builder()
                .nom("EMSI MAARIF")
                .adresse("BIR ANZARAN")
                .listEtudiants(null).build();
        centreRepository.save(c1);

        Centre c2=Centre.builder()
                .nom("EMSI ROUDANI")
                .adresse("ROUDANI")
                .listEtudiants(null).build();


        centreRepository.save(c2);

        Etudiant et1=Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .centre(c1)
                .build();
        etudiantRepository.save(et1);

        Etudiant et2=Etudiant.builder()
                .nom("kaine")
                .prenom("chaimaa")
                .genre(Genre.Femme)
                .centre(c2)
                .build();
        etudiantRepository.save(et2);

        Etudiant et3=Etudiant.builder()
                .nom("manir")
                .prenom("Mounir")
                .genre(Genre.Homme)
                .centre(c1)
                .build();
        etudiantRepository.save(et3);

        Etudiant et4=Etudiant.builder()
                .nom("Sra")
                .prenom("Sarita")
                .genre(Genre.Femme)
                .centre(c2)
                .build();
        etudiantRepository.save(et1);

        List<Etudiant>l1=new ArrayList<>();
        l1.add(et1);
        l1.add(et3);
        c1.setListEtudiants(l1);

        List<Etudiant>l2=new ArrayList<>();
        l2.add(et2);
        l2.add(et4);
        c2.setListEtudiants(l2);

        centreRepository.save(c1);
        centreRepository.save(c2);



    }
}
