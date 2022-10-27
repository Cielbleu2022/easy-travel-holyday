package com.example.EasyTravelHolyday.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Table(name = "offre")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalDate dateDepart;

    @Column(nullable = false)
    private LocalDate dateArrive;

    @Column(nullable = false,name = "titre")
    private String titre;

    @Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
    private double prix;

    @Column(nullable = false)
    private int nbplacetotal;

    @Column(nullable = false)
    private int nbLike;

    @Column(nullable = false,columnDefinition = "boolean default false")
    private boolean publier;
    @Lob
    @Column(nullable = false)
    private String image;
    //Association mère avec Classe Destination
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "passe",
            joinColumns = @JoinColumn(name = "offre_id"),
            inverseJoinColumns = @JoinColumn(name = "destination_id"))
    private Set<Destination> destinations;

    //Association fille avec Classe Trajet
    @ManyToMany(mappedBy = "offreTrajets", fetch = FetchType.LAZY)
    private Set<Trajet> trajets;

    //Association mère avec la classe TypeOffres
    @ManyToOne
    @JoinColumn(name = "Offre_type", foreignKey = @ForeignKey(name = "FK_Offre_type"))
    private TypeOffres typeOffre;


}
