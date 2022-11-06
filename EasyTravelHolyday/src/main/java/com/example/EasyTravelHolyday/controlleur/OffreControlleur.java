package com.example.EasyTravelHolyday.controlleur;

import com.example.EasyTravelHolyday.models.dto.AdresseDTO;
import com.example.EasyTravelHolyday.models.dto.OffreDTO;
import com.example.EasyTravelHolyday.services.OffreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/offre")
public class OffreControlleur {
    private final OffreService offreService;

    public OffreControlleur(OffreService offreService) {
        this.offreService = offreService;
    }
    @GetMapping(path = {"","/","/all"})
    public ResponseEntity<List<OffreDTO>> getAll(){
        return ResponseEntity
                .ok(offreService.getAll());
    }
}
