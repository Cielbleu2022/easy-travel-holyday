package com.example.EasyTravelHolyday.models.dto;

import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalOffreDTO;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class TrajetDTO {
    private Long id;

    private SmalDestinationDTO departDestination;

    private SmalDestinationDTO arriveDestination;

    private TrajetDTO.TransportDTO transport;

    private Set<SmalOffreDTO> offreTrajets;

    @Data
    @Builder
    public static class TransportDTO{
        private String nom;
    }
}
