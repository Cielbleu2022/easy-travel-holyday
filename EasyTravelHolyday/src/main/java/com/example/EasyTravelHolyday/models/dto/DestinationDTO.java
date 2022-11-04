package com.example.EasyTravelHolyday.models.dto;

import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalAdresseDTO;
import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalOffreDTO;
import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalTrajetDTO;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class DestinationDTO {
    private Long id;

    private String normeCovid;

    private Set<SmalOffreDTO> offres;

    private SmalAdresseDTO adresseDestination;

    private Set<SmalTrajetDTO> depart;

    private Set<SmalTrajetDTO> arrive;
}
