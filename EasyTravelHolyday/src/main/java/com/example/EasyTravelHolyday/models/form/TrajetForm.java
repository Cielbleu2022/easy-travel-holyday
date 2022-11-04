package com.example.EasyTravelHolyday.models.form;

import lombok.Data;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
@Data
@Validated
@ToString
public class TrajetForm {
        @NotNull
        private Long departDestinationId;
        @NotNull
        private Long arriveDestinationId;

        @NotEmpty
        private String transport;
        @NotNull
        private List<Long> offreId;


}
