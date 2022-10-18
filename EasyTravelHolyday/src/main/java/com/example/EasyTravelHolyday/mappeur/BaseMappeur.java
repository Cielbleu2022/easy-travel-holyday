package com.example.EasyTravelHolyday.mappeur;

import java.util.List;

public interface BaseMappeur <DTO,Entity,Form,Updateform>{

    DTO entityToDTO(Entity adresse );
    Entity formToEntity(Form adresseform);
    Entity formUpdateToEntity(Updateform adresseupdateform);
}
