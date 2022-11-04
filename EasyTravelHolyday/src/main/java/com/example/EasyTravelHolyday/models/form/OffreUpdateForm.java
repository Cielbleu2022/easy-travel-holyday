package com.example.EasyTravelHolyday.models.form;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
@Validated
public class OffreUpdateForm {
    @NotNull
    private boolean publier;

}
