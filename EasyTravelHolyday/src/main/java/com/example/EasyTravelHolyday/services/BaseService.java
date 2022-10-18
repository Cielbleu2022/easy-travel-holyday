package com.example.EasyTravelHolyday.services;

import java.util.List;

public interface BaseService <DTO,Entity,Form,UpdateForm>{
    List<DTO> getAll();
    DTO add(Form toAdd);
    DTO remove(Entity id);
    DTO uptate(Entity id, UpdateForm update);
    DTO findOne(Entity id);
}
