package com.example.EasyTravelHolyday.services;

import com.example.EasyTravelHolyday.mappeur.TypeOffresMappeur;
import com.example.EasyTravelHolyday.models.dto.TypeOffresDTO;
import com.example.EasyTravelHolyday.models.entity.TypeOffres;
import com.example.EasyTravelHolyday.models.form.TypeOffresForm;
import com.example.EasyTravelHolyday.models.form.TypeOffresUpdateForm;
import com.example.EasyTravelHolyday.repository.TypeOffresRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeOffresService implements BaseService<TypeOffresDTO, Integer, TypeOffres, TypeOffresForm, TypeOffresUpdateForm>{
    private final TypeOffresRepository typeOffresRepository;
    private final TypeOffresMappeur typeOffresMappeur;

    public TypeOffresService(TypeOffresRepository typeOffresRepository, TypeOffresMappeur typeOffresMappeur) {
        this.typeOffresRepository = typeOffresRepository;
        this.typeOffresMappeur = typeOffresMappeur;
    }

    @Override
    public List<TypeOffresDTO> getAll() {
        return typeOffresRepository.findAll()
                .stream()
                .map(typeOffresMappeur::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TypeOffresDTO add(TypeOffresForm toAdd) {
        return null;
    }

    @Override
    public TypeOffresDTO remove(Integer integer) {
        return null;
    }

    @Override
    public TypeOffresDTO uptate(Integer integer, TypeOffresUpdateForm update) {
        return null;
    }

    @Override
    public TypeOffresDTO findOne(Integer integer) {
        return null;
    }
}
