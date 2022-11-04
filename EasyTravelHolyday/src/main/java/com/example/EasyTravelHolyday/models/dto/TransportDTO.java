package com.example.EasyTravelHolyday.models.dto;

import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalTrajetDTO;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class TransportDTO {
    private Long id;
    private String nom;

    private Set<SmalTrajetDTO> trajetTransport;
}
