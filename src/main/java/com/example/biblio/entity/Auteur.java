package com.example.biblio.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
 public  class Auteur {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id ;

 @NotBlank
 private String nom;

 @Email
 private String email ;


 @OneToMany(mappedBy = "auteur")
 private List<Livre> livres = new ArrayList<>();



}