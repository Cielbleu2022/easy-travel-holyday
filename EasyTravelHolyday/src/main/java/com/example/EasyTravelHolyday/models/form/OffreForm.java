package com.example.EasyTravelHolyday.models.form;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@Validated
public class OffreForm {
    @NotBlank
    private String titre;
    @Min(1)
    private double prix;
    @Min(1)
    private int nbplacetotal;
    @Future
    private LocalDate dateDepart;
    @Future
    private LocalDate dateArrive;
    @NotBlank
    private String image;
    @NotNull
    private Long typeOffreID;
    @NotNull
    private List<Long> destinationID;
}
