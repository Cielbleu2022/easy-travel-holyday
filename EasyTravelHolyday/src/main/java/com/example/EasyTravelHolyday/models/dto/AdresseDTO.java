package com.example.EasyTravelHolyday.models.dto;

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
}
