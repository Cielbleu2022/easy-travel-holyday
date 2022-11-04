package com.example.EasyTravelHolyday.models.dto.SmalDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmalDestinationDTO {
    private Long id;
    private String normeCovid;
    private SmalAdresseDTO adresseDestination;
}
