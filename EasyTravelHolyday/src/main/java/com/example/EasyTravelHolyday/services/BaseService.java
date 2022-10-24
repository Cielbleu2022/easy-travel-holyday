package com.example.EasyTravelHolyday.services;

import java.util.List;

public interface BaseService <DTO,ID,Entity,Form,UpdateForm>{
    List<DTO> getAll();
    DTO add(Form toAdd);
    DTO remove(ID id);
    DTO uptate(ID id, UpdateForm update);
    DTO findOne(ID id);
}
