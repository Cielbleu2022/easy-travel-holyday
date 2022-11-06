package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.TypeOffresDTO;
import com.example.EasyTravelHolyday.models.entity.TypeOffres;
import com.example.EasyTravelHolyday.models.form.TypeOffreForm;
import com.example.EasyTravelHolyday.models.form.TypeOffreUpdateForm;
import org.springframework.stereotype.Service;

@Service
public class TypeOffreMappeur implements BaseMappeur<TypeOffresDTO, TypeOffres, TypeOffreForm, TypeOffreUpdateForm>{
    @Override
    public TypeOffresDTO entityToDTO(TypeOffres typeOffres) {
        return null;
    }

    @Override
    public TypeOffres formToEntity(TypeOffreForm entityform) {
        return null;
    }

    @Override
    public TypeOffres formUpdateToEntity(TypeOffreUpdateForm entityupdateform) {
        return null;
    }
}
