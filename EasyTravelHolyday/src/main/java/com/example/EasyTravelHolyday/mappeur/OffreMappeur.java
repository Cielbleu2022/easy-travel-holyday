package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.OffreDTO;
import com.example.EasyTravelHolyday.models.entity.Offre;
import com.example.EasyTravelHolyday.models.form.OffreForm;
import com.example.EasyTravelHolyday.models.form.OffreUpdateForm;

import java.util.stream.Collectors;


public class OffreMappeur implements BaseMappeur<OffreDTO, Offre, OffreForm, OffreUpdateForm>{
    private  final TrajetMappeur trajetMappeur;
    private final TypeOffreMappeur typeOffreMappeur;
    protected  final  DestinationMappeur destinationMappeur;

    public OffreMappeur(TrajetMappeur trajetMappeur, TypeOffreMappeur typeOffreMappeur, DestinationMappeur destinationMappeur) {
        this.trajetMappeur = trajetMappeur;
        this.typeOffreMappeur = typeOffreMappeur;
        this.destinationMappeur = destinationMappeur;
    }

    @Override
    public OffreDTO entityToDTO(Offre offre) {
        if(offre==null)return null;
        OffreDTO.OffreDTOBuilder builder = OffreDTO.builder()
        .id(offre.getId())
        .titre(offre.getTitre())
        .prix(offre.getPrix())
        .nbplacetotal(offre.getNbplacetotal())
        .dateDepart(offre.getDateDepart())
        .dateArrive(offre.getDateArrive())
        .nbLike(offre.getNbLike())
        .publier(offre.isPublier())
        .image(offre.getImage())
        .smalldestinationList(offre.getDestinations().stream().map(destinationMappeur::entityTosmalDTO).collect(Collectors.toSet()))
        .trajets(offre.getTrajets().stream().map(trajetMappeur::entityToDTO).collect(Collectors.toSet()))
        .typeOffre(typeOffreMappeur.entityToDTO(offre.getTypeOffre()));


        return builder.build();
    }

    @Override
    public Offre formToEntity(OffreForm offreForm) {
        return null;
    }

    @Override
    public Offre formUpdateToEntity(OffreUpdateForm offreUpdateForm) {
        return null;
    }
}
