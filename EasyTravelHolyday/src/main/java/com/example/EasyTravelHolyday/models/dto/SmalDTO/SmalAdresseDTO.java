package com.example.EasyTravelHolyday.models.dto.SmalDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmalAdresseDTO {
    private Long id;
    private String pays;
    private String ville;
    private String rue;
    private int numero;
}
