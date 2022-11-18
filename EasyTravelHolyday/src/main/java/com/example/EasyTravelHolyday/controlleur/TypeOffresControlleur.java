package com.example.EasyTravelHolyday.controlleur;

import com.example.EasyTravelHolyday.models.dto.TypeOffresDTO;
import com.example.EasyTravelHolyday.services.TypeOffresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/typeoffre")
public class TypeOffresControlleur {
    private final TypeOffresService typeOffresService;

    public TypeOffresControlleur(TypeOffresService typeOffresService) {
        this.typeOffresService = typeOffresService;
    }
    @GetMapping(path = {"","/","/all"})
    public ResponseEntity<List<TypeOffresDTO>> getAll(){
        return ResponseEntity
                .ok(typeOffresService.getAll());
    }
}
