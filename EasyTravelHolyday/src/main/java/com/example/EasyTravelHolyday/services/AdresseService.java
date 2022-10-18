package com.example.EasyTravelHolyday.services;

import com.example.EasyTravelHolyday.mappeur.AdresseMappeur;
import com.example.EasyTravelHolyday.models.dto.AdresseDTO;
import com.example.EasyTravelHolyday.models.entity.Adresse;
import com.example.EasyTravelHolyday.models.form.AdresseForm;
import com.example.EasyTravelHolyday.models.form.AdresseUpdateForm;
import com.example.EasyTravelHolyday.repository.AdresseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService implements BaseService<AdresseDTO, Adresse, AdresseForm, AdresseUpdateForm>{
    private final AdresseRepository adresseRepository;
    private final AdresseMappeur adresseMappeur;

    public AdresseService(AdresseRepository adresseRepository, AdresseMappeur adresseMappeur) {
        this.adresseRepository = adresseRepository;
        this.adresseMappeur = adresseMappeur;
    }

    @Override
    public List<AdresseDTO> getAll() {
        return null;
    }

    @Override
    public AdresseDTO add(AdresseForm toAdd) {
        Adresse adresse= adresseMappeur.formToEntity(toAdd);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^"+toAdd);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^"+adresse);
        return adresseMappeur.entityToDTO(adresseRepository.save(adresse));
    }

    @Override
    public AdresseDTO remove(Adresse id) {
        return null;
    }

    @Override
    public AdresseDTO uptate(Adresse id, AdresseUpdateForm update) {
        return null;
    }

    @Override
    public AdresseDTO findOne(Adresse id) {
        return null;
    }
}
