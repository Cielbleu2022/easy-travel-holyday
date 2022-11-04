package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.TrajetDTO;
import com.example.EasyTravelHolyday.models.entity.Trajet;
import com.example.EasyTravelHolyday.models.form.TrajetForm;
import com.example.EasyTravelHolyday.models.form.TrajetUpdateForm;

public class TrajetMappeur implements BaseMappeur<TrajetDTO, Trajet, TrajetForm, TrajetUpdateForm>{
    @Override
    public TrajetDTO entityToDTO(Trajet trajet) {
        return null;
    }

    @Override
    public Trajet formToEntity(TrajetForm entityform) {
        return null;
    }

    @Override
    public Trajet formUpdateToEntity(TrajetUpdateForm entityupdateform) {
        return null;
    }
}
