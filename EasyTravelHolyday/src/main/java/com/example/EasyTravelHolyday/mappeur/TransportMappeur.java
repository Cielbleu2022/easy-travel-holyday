package com.example.EasyTravelHolyday.mappeur;

import com.example.EasyTravelHolyday.models.dto.TransportDTO;
import com.example.EasyTravelHolyday.models.entity.Transport;
import com.example.EasyTravelHolyday.models.form.TransportForm;
import com.example.EasyTravelHolyday.models.form.TransportUpdateForm;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
@Service
public class TransportMappeur implements BaseMappeur<TransportDTO, Transport, TransportForm, TransportUpdateForm>{
    private final TrajetMappeur trajetMappeur;

    public TransportMappeur(TrajetMappeur trajetMappeur) {
        this.trajetMappeur = trajetMappeur;
    }

    @Override
    public TransportDTO entityToDTO(Transport transport) {
        if(transport==null)return null;
        return TransportDTO.builder()
                .id(transport.getId())
                .nom(transport.getNom())
                .trajetTransport(transport.getTrajetTransport().stream().map(trajetMappeur::toSmallDto).collect(Collectors.toSet()))
                .build();
    }

    @Override
    public Transport formToEntity(TransportForm entityform) {

        return null;
    }

    @Override
    public Transport formUpdateToEntity(TransportUpdateForm entityupdateform) {
        return null;
    }
}
