package com.example.EasyTravelHolyday.models.form;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Validated
public class AdresseForm {

    @NotBlank
    private String pays;
    @NotBlank
    private String ville;
    @NotBlank
    private String rue;
    @Min(1)
    private int numero;
}
