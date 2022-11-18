package com.example.EasyTravelHolyday.controlleur;

import com.example.EasyTravelHolyday.models.dto.TransportDTO;
import com.example.EasyTravelHolyday.models.dto.TypeOffresDTO;
import com.example.EasyTravelHolyday.services.TransportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transport")
public class TransportControlleur {
    private final TransportService transportService;

    public TransportControlleur(TransportService transportService) {
        this.transportService = transportService;
    }
    @GetMapping(path = {"","/","/all"})
    public ResponseEntity<List<TransportDTO>> getAll(){
        return ResponseEntity
                .ok(transportService.getAll());
    }
}
