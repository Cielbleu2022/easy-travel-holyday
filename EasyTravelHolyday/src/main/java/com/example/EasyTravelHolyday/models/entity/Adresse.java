package com.example.EasyTravelHolyday.models.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "adresse")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String pays;
    @Column(nullable = false)
    private String ville;
    @Column(nullable = false)
    private String rue;
    @Column(nullable = false)
    private int numero;
}
