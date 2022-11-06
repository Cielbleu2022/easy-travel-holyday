package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.DestinationDTO;
import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.EasyTravelHolyday.models.entity.Destination;
import com.example.EasyTravelHolyday.models.form.DestinationForm;
import com.example.EasyTravelHolyday.models.form.DestinationUpdateForm;
import org.springframework.stereotype.Service;

@Service
public class DestinationMappeur implements BaseMappeur <DestinationDTO,Destination, DestinationForm, DestinationUpdateForm>{
    private final AdresseMappeur adresseMappeur;

    public DestinationMappeur(AdresseMappeur adresseMappeur) {
        this.adresseMappeur = adresseMappeur;
    }

    @Override
    public DestinationDTO entityToDTO(Destination destination) {
        if(destination==null) return null;
        DestinationDTO destinationDTO= DestinationDTO.builder()
                .id(destination.getId())
                .normeCovid(destination.getNormeCovid())
                .adresseDestination(adresseMappeur.toDtoSmall(destination.getAdresseDestination()))
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
        Destination destination = new Destination();
        destination.getNormeCovid();
        return destination;
    }

    @Override
    public Destination formUpdateToEntity(DestinationUpdateForm adresseupdateform) {
        return null;
    }
}
