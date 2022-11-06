package com.example.EasyTravelHolyday.models.form;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Validated
public class OffreUpdateForm {
    @NotBlank
    private String titre;
    @Min(1)
    private double prix;
    @Min(1)
    private int nbplacetotal;

}
