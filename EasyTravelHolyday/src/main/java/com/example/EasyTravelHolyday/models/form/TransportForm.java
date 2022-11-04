package com.example.EasyTravelHolyday.models.form;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data
@Validated
public class TransportForm {
        @NotBlank
        private String nom;
}
