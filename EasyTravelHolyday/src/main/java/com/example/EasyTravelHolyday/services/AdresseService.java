package com.example.EasyTravelHolyday.services;

import com.example.EasyTravelHolyday.mappeur.AdresseMappeur;
import com.example.EasyTravelHolyday.models.dto.AdresseDTO;
import com.example.EasyTravelHolyday.models.entity.Adresse;
import com.example.EasyTravelHolyday.models.form.AdresseForm;
import com.example.EasyTravelHolyday.models.form.AdresseUpdateForm;
import com.example.EasyTravelHolyday.repository.AdresseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdresseService implements BaseService<AdresseDTO,Long, Adresse, AdresseForm, AdresseUpdateForm>{
    private final AdresseRepository adresseRepository;
    private final AdresseMappeur adresseMappeur;

    public AdresseService(AdresseRepository adresseRepository, AdresseMappeur adresseMappeur) {
        this.adresseRepository = adresseRepository;
        this.adresseMappeur = adresseMappeur;
    }

    @Override
    public List<AdresseDTO> getAll() {

        return adresseRepository.findAll()
                .stream()
                .map(adresseMappeur::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AdresseDTO add(AdresseForm toAdd) {
        Adresse adresse= adresseMappeur.formToEntity(toAdd);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^"+toAdd);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^"+adresse);
        return adresseMappeur.entityToDTO(adresseRepository.save(adresse));
    }



    @Override
    public AdresseDTO uptate(Long aLong, AdresseUpdateForm adresseUpdateForm) {

            Adresse adresse = adresseRepository.findById(aLong).orElseThrow();
            adresse.setRue(adresseUpdateForm.getRue());
            return adresseMappeur.entityToDTO(adresseRepository.save(adresse));

    }

    @Override
    public AdresseDTO findOne(Long aLong) {

        return adresseRepository.findById(aLong)
                .map(adresseMappeur::entityToDTO)
                .orElseThrow();

    }

    @Override
    public AdresseDTO remove(Long iddres) {
        Adresse adresse = adresseRepository.findById(iddres).orElseThrow();
        /** now you can call delete from repository and pass the variable entity personne (it is a void methode)**/
        adresseRepository.delete(adresse);
        return adresseMappeur.entityToDTO(adresse);
    }



}
