package com.example.biblio.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column
    @NotEmpty
    private String titre ;

    @Column(unique = true)
    private String isbn ;


    @Positive
    private Double price ;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;


}
