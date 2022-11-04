package com.example.EasyTravelHolyday.models.dto.SmalDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmalTrajetDTO {
    private Long id;
    private String transport;
    private SmalDestinationDTO departDestination;
    private SmalDestinationDTO arriveDestination;
}
