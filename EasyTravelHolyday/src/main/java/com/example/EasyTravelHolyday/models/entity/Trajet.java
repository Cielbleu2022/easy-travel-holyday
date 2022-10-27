package com.example.EasyTravelHolyday.models.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Table(name = "trajet")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Trajet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Association mère avec Classe Transport
    @ManyToOne
    @JoinColumn(name = "transport_trajet", foreignKey = @ForeignKey(name = "FK_transport_trajet"))
    private Transport transport;

    //Association mère avec Classe Destination
    @ManyToOne
    @JoinColumn(name = "trajet_depart", foreignKey = @ForeignKey(name = "FK_trajet_depart"))
    private Destination trajetDepart;
    @ManyToOne
    @JoinColumn(name = "trajet_arrive", foreignKey = @ForeignKey(name = "FK_trajet_arrive"))
    private Destination trajetArrive;

    //Association mère avec Classe Offre
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "parcours",
            joinColumns = @JoinColumn(name = "trajet_id"),
            inverseJoinColumns = @JoinColumn(name = "offre_id"))

    private Set<Offre> offreTrajets;




}
