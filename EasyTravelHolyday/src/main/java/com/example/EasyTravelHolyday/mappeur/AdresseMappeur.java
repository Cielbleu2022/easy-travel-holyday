package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.AdresseDTO;
import com.example.EasyTravelHolyday.models.dto.SmalDTO.SmalAdresseDTO;
import com.example.EasyTravelHolyday.models.entity.Adresse;
import com.example.EasyTravelHolyday.models.form.AdresseForm;
import com.example.EasyTravelHolyday.models.form.AdresseUpdateForm;
import org.springframework.stereotype.Service;

@Service
public class AdresseMappeur implements BaseMappeur<AdresseDTO, Adresse, AdresseForm, AdresseUpdateForm>{

    @Override
    public AdresseDTO entityToDTO(Adresse adresse) {
        if(adresse==null)return null;
        AdresseDTO adresseDTO= AdresseDTO.builder()
                /***
                 ou return = adresseDTO.builder()
                 * ***/
                .id(adresse.getId())
                .pays(adresse.getPays())
                .ville(adresse.getVille())
                .rue(adresse.getRue())
                .numero(adresse.getNumero())
                .build()
                ;
     return adresseDTO;

    }

    public SmalAdresseDTO toDtoSmall(Adresse adresse) {
        if(adresse==null)return null;
        return SmalAdresseDTO.builder()
                .id(adresse.getId())
                .pays(adresse.getPays())
                .ville(adresse.getVille())
                .rue(adresse.getRue())
                .numero(adresse.getNumero())
                .build();
    }

    @Override
    public Adresse formToEntity(AdresseForm adresseform) {
        Adresse entity = new Adresse();
        entity.setPays(adresseform.getPays());
        entity.setVille(adresseform.getVille());
        entity.setRue(adresseform.getRue());
        entity.setNumero(adresseform.getNumero());
        return entity;
    }

    @Override
    public Adresse formUpdateToEntity(AdresseUpdateForm adresseupdateform) {
        Adresse entity= new Adresse();
        entity.setRue(entity.getRue());
        entity.setNumero(entity.getNumero());
        return entity;
    }
}
