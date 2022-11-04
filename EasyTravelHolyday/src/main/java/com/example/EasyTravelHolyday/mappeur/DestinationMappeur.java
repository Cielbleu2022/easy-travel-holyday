package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.DestinationDTO;
import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.EasyTravelHolyday.models.entity.Destination;
import com.example.EasyTravelHolyday.models.form.DestinationForm;
import com.example.EasyTravelHolyday.models.form.DestinationUpdateForm;

public class DestinationMappeur implements BaseMappeur <DestinationDTO,Destination, DestinationForm, DestinationUpdateForm>{
    @Override
    public DestinationDTO entityToDTO(Destination destination) {
        if(destination==null) return null;
        DestinationDTO destinationDTO= DestinationDTO.builder()
                .id(destination.getId())
                .normeCovid(destination.getNormeCovid())
                .build();
        return destinationDTO;
    }
    
    public SmalDestinationDTO entityTosmalDTO(Destination destination) {
        if(destination==null) return null;
        SmalDestinationDTO smalDestination= SmalDestinationDTO.builder()
                .id(destination.getId())
                .normeCovid(destination.getNormeCovid())
                .build();
        return smalDestination;
    }

    @Override
    public Destination formToEntity(DestinationForm adresseform) {
        return null;
    }

    @Override
    public Destination formUpdateToEntity(DestinationUpdateForm adresseupdateform) {
        return null;
    }
}
