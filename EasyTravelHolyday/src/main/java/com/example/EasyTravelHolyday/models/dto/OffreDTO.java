package com.example.EasyTravelHolyday.models.dto;

import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalDestinationDTO;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@ToString
public class OffreDTO {
    private Long id;
    private String titre;
    private double prix;
    private int nbplacetotal;
    private LocalDate dateDepart;
    private LocalDate dateArrive;
    private int nbLike;
    private boolean publier;
    private String image;
    private Set<TrajetDTO> trajets;
    private Set<SmalDestinationDTO> smalldestinationList;
    private TypeOffresDTO typeOffre;
}
