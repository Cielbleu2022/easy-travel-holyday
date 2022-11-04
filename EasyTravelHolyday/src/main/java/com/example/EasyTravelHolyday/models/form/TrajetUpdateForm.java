package com.example.EasyTravelHolyday.models.form;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Validated
public class TrajetUpdateForm {
    @NotNull
    private Long departDestinationId;
    @NotNull
    private Long arriveDestinationId;

    @NotEmpty
    private String transport;
}
