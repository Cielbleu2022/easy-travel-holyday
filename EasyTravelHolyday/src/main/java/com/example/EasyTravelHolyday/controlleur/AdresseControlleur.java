package com.example.EasyTravelHolyday.controlleur;

import com.example.EasyTravelHolyday.models.dto.AdresseDTO;
import com.example.EasyTravelHolyday.models.entity.Adresse;
import com.example.EasyTravelHolyday.models.form.AdresseForm;
import com.example.EasyTravelHolyday.models.form.AdresseUpdateForm;
import com.example.EasyTravelHolyday.services.AdresseService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping(path = {"","/","/all"})
    public ResponseEntity<List<AdresseDTO>> getAll(){
        return ResponseEntity
                .ok(adresseService.getAll());
    }

    @GetMapping(path = {"/searchAdresse"},params = {"idAdresse"})
    public ResponseEntity<AdresseDTO> findOne(@RequestParam Long idAdresse){
        return ResponseEntity
                .ok(adresseService.findOne(idAdresse));
    }

    @DeleteMapping(path = {"", "/", "/delete"},params = {"idAdresse"})
    public ResponseEntity<AdresseDTO> delete(@RequestParam Long idAdresse){
        return ResponseEntity
                .ok(adresseService.remove(idAdresse));
    }

    @PatchMapping (path = {"", "/", "/update"},params = {"idAdresse"})
    public AdresseDTO update( @RequestParam Long idAdresse, @Valid @RequestBody AdresseUpdateForm form, @RequestHeader HttpHeaders headers){
        for (String key : headers.keySet()) {
            System.out.println( headers.get(key) );
        }
        return adresseService.uptate(idAdresse, form);

    }

}
