package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalDestinationDTO;
import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalOffreDTO;
import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalTrajetDTO;
import com.example.EasyTravelHolyday.models.dto.TrajetDTO;
import com.example.EasyTravelHolyday.models.entity.Destination;
import com.example.EasyTravelHolyday.models.entity.Offre;
import com.example.EasyTravelHolyday.models.entity.Trajet;
import com.example.EasyTravelHolyday.models.entity.Transport;
import com.example.EasyTravelHolyday.models.form.TrajetForm;
import com.example.EasyTravelHolyday.models.form.TrajetUpdateForm;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
@Service
public class TrajetMappeur implements BaseMappeur<TrajetDTO, Trajet, TrajetForm, TrajetUpdateForm>{
    private final AdresseMappeur adresseMappeur;

    public TrajetMappeur(AdresseMappeur adresseMappeur) {
        this.adresseMappeur = adresseMappeur;
    }

    @Override
    public TrajetDTO entityToDTO(Trajet trajet) {
        if(trajet==null)return null;
        return TrajetDTO.builder()
                .id(trajet.getId())
                .transport(transportMappeur(trajet.getTransport()))
                .departDestination(entityToDestination(trajet.getTrajetDepart()))
                .arriveDestination(entityToDestination(trajet.getTrajetArrive()))
                .offreTrajets(trajet.getOffreTrajets().stream().map(this::toSmalOffreDto2).collect(Collectors.toSet()))
                .build();
    }
    public SmalDestinationDTO entityToDestination(Destination entity){
        return SmalDestinationDTO.builder()
                .id(entity.getId())
                .normeCovid(entity.getNormeCovid())
                .adresseDestination(adresseMappeur.toDtoSmall(entity.getAdresseDestination()))
                .build();
    }

    private TrajetDTO.TransportDTO transportMappeur(Transport transport) {
        if(transport==null)return null;
        return TrajetDTO.TransportDTO.builder()
                .nom(transport.getNom())
                .build();
    }

    public SmalOffreDTO toSmalOffreDto2(Offre offre) {
        if(offre==null)return null;
        return SmalOffreDTO.builder()
                .titre(offre.getTitre())
                .prix(offre.getPrix())
                .nbplacetotal(offre.getNbplacetotal())
                .build();
    }


    public SmalTrajetDTO toSmallDto(Trajet entity) {
        if(entity==null)return null;
        return SmalTrajetDTO.builder()
                .id(entity.getId())
                .transport(entity.getTransport().getNom())
                .build();
    }

    @Override
    public Trajet formToEntity(TrajetForm entityform) {

        Trajet trajet=new Trajet();
        return trajet;
    }

    @Override
    public Trajet formUpdateToEntity(TrajetUpdateForm entityupdateform) {
        return null;
    }
}
