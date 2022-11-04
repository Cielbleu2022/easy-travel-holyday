package com.example.EasyTravelHolyday.models.dto;

import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.EasyTravelHolyday.models.entity.Destination;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class AdresseDTO {

        private Long id;
        private String pays;
        private String ville;
        private String rue;
        private int numero;
        private SmalDestinationDTO concerdestination;
}
