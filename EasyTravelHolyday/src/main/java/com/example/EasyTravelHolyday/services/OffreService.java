package com.example.EasyTravelHolyday.services;

import com.example.EasyTravelHolyday.mappeur.OffreMappeur;
import com.example.EasyTravelHolyday.models.dto.OffreDTO;
import com.example.EasyTravelHolyday.models.entity.Offre;
import com.example.EasyTravelHolyday.models.form.OffreForm;
import com.example.EasyTravelHolyday.models.form.OffreUpdateForm;
import com.example.EasyTravelHolyday.repository.OffreRepository;
import com.example.EasyTravelHolyday.repository.TypeOffresRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OffreService implements BaseService<OffreDTO, Integer,Offre, OffreForm, OffreUpdateForm>{
    private final OffreRepository offreRepository;
    private final OffreMappeur offreMappeur;
    private final TypeOffresRepository typeOffresRepository;

    public OffreService(OffreRepository offreRepository, OffreMappeur offreMappeur, TypeOffresRepository typeOffresRepository ){
        this.offreRepository = offreRepository;
        this.offreMappeur = offreMappeur;
        this.typeOffresRepository = typeOffresRepository;
    }

    @Override
    public List<OffreDTO> getAll() {

        return offreRepository.findAll()
                .stream()
                .map(offreMappeur::entityToDTO)
                .collect(Collectors.toList());
    }


//    public OffreDTO findByID(Long id) {
//
//        return offreRepository.findById(id)
//                .map(offreMappeur::entityToDTO)
//                .orElseThrow();
//    }

    @Override
    public OffreDTO add(OffreForm addOffre) {
        Offre newOffre = new Offre();
        newOffre.setTitre(addOffre.getTitre());
        newOffre.setPrix(addOffre.getPrix());
        newOffre.setNbplacetotal(addOffre.getNbplacetotal());
        newOffre.setDateDepart(addOffre.getDateDepart());
        newOffre.setDateArrive(addOffre.getDateArrive());
        newOffre.setImage(addOffre.getImage());
        return null;
    }

    @Override
    public OffreDTO remove(Integer integer) {
        return null;
    }

    @Override
    public OffreDTO uptate(Integer integer, OffreUpdateForm update) {
        return null;
    }

    @Override
    public OffreDTO findOne(Integer integer) {

        return null;
    }
}
