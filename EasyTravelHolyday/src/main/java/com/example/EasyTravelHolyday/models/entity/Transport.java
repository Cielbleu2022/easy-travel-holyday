package com.example.EasyTravelHolyday.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Table(name = "transport")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nom;

    //Association fille avec Classe Trajet
    @OneToMany(mappedBy = "transport")
    private Set<Trajet> trajetTransport;
}
