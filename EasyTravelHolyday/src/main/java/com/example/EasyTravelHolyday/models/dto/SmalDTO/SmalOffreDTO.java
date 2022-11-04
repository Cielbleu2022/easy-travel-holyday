package com.example.EasyTravelHolyday.models.dto.SmalDTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class SmalOffreDTO {
    private LocalDate dateDepart;
    private LocalDate dateArrive;
    private String titre;
    private double prix;
    private int nbplacetotal;
    private String lien;
}
