package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.TypeOffresDTO;
import com.example.EasyTravelHolyday.models.entity.TypeOffres;
import com.example.EasyTravelHolyday.models.form.TypeOffresForm;
import com.example.EasyTravelHolyday.models.form.TypeOffresUpdateForm;
import org.springframework.stereotype.Service;

@Service
public class TypeOffresMappeur implements BaseMappeur<TypeOffresDTO, TypeOffres, TypeOffresForm, TypeOffresUpdateForm>{
    @Override
    public TypeOffresDTO entityToDTO(TypeOffres typeOffres) {
        if(typeOffres==null)return null;
        return TypeOffresDTO.builder()
                .id(typeOffres.getId())
                .nom(typeOffres.getNom()).build();
    }

    @Override
    public TypeOffres formToEntity(TypeOffresForm entityform) {
        return null;
    }

    @Override
    public TypeOffres formUpdateToEntity(TypeOffresUpdateForm entityupdateform) {
        return null;
    }
}
