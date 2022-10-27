package com.example.EasyTravelHolyday.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "type_offres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TypeOffres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    //Association fille avec la classe Offre
    @OneToMany(mappedBy = "typeOffre")
    private Set<Offre> listOffres;
}
