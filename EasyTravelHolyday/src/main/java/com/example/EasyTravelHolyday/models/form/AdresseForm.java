package com.example.EasyTravelHolyday.models.form;

import lombok.Data;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Validated
@ToString
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
