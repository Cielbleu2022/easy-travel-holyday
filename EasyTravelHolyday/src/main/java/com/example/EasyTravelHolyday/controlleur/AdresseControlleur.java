package com.example.EasyTravelHolyday.controlleur;

import com.example.EasyTravelHolyday.models.dto.AdresseDTO;
import com.example.EasyTravelHolyday.models.form.AdresseForm;
import com.example.EasyTravelHolyday.services.AdresseService;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/adresse")
public class AdresseControlleur {
    private final AdresseService adresseService;

    public AdresseControlleur(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    @PostMapping(path = {"", "/", "/add"})
    public AdresseDTO insert(@Valid @RequestBody AdresseForm form, @RequestHeader HttpHeaders headers){
        for (String key : headers.keySet()) {
            System.out.println( headers.get(key) );
        }

        System.out.println("-------------------------------"+form);
        return adresseService.add(form);

    }
}
