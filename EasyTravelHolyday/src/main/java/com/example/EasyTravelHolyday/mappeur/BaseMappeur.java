package com.example.EasyTravelHolyday.mappeur;

import java.util.List;

public interface BaseMappeur <DTO,Entity,Form,Updateform>{

    DTO entityToDTO(Entity entity );
    Entity formToEntity(Form entityform);
    Entity formUpdateToEntity(Updateform entityupdateform);
}
