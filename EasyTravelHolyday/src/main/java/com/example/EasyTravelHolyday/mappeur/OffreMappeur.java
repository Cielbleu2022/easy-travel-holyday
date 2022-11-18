package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.OffreDTO;
import com.example.EasyTravelHolyday.models.entity.Offre;
import com.example.EasyTravelHolyday.models.form.OffreForm;
import com.example.EasyTravelHolyday.models.form.OffreUpdateForm;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class OffreMappeur implements BaseMappeur<OffreDTO, Offre, OffreForm, OffreUpdateForm>{
    private  final TrajetMappeur trajetMappeur;
    private final TypeOffresMappeur typeOffresMappeur;
    protected  final  DestinationMappeur destinationMappeur;

    public OffreMappeur(TrajetMappeur trajetMappeur, TypeOffresMappeur typeOffresMappeur, DestinationMappeur destinationMappeur) {
        this.trajetMappeur = trajetMappeur;
        this.typeOffresMappeur = typeOffresMappeur;
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
        .trajets(offre.getTrajets().stream().map(trajetMappeur::entityToDTO).collect(Collectors.toSet()))
        .smalldestinationList(offre.getDestinations().stream().map(destinationMappeur::entityTosmalDTO).collect(Collectors.toSet()))
        .typeOffre(typeOffresMappeur.entityToDTO(offre.getTypeOffre()));


        return builder.build();
    }

    @Override
    public Offre formToEntity(OffreForm offreForm) {
        Offre offre= new Offre();
        offre.setTitre(offreForm.getTitre());
        offre.setPrix(offreForm.getPrix());
        offre.setNbplacetotal(offreForm.getNbplacetotal());
        offre.setDateDepart(offreForm.getDateDepart());
        offre.setDateArrive(offreForm.getDateArrive());
        offre.setNbLike((int)offreForm.getPrix()*offreForm.getNbplacetotal());
        offre.setImage(offreForm.getImage());
        return offre;
    }

    @Override
    public Offre formUpdateToEntity(OffreUpdateForm offreUpdateForm) {
        Offre offreupdate = new Offre();
        offreupdate.setTitre(offreUpdateForm.getTitre());
        offreupdate.setPrix(offreUpdateForm.getPrix());
        offreupdate.setNbplacetotal(offreUpdateForm.getNbplacetotal());

        return offreupdate;
    }
}
