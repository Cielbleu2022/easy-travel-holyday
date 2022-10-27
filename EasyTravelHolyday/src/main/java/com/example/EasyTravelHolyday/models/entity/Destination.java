package com.example.EasyTravelHolyday.models.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "destination")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String normeCovid;
    //Association mère avec Classe Adresse
    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = false)
    @JoinColumn(name = "adresse_destination", foreignKey = @ForeignKey(name = "FK_adresse_destination"))
    private Adresse adresseDestination;

    //Association fille avec la classe Offre
    @ManyToMany(mappedBy = "destinations", fetch = FetchType.LAZY)
    private Set<Offre> offreDestinations;

    //Association fille avec Classe Trajet
    @OneToMany(mappedBy = "trajetDepart")
    private Set<Trajet> departDestination;
    @OneToMany(mappedBy = "trajetArrive")
    private Set<Trajet> arriveDestination;


}
