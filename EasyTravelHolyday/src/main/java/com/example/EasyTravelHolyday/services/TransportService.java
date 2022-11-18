package com.example.EasyTravelHolyday.services;

import com.example.EasyTravelHolyday.mappeur.TransportMappeur;
import com.example.EasyTravelHolyday.models.dto.TransportDTO;
import com.example.EasyTravelHolyday.models.entity.Transport;
import com.example.EasyTravelHolyday.models.form.TransportForm;
import com.example.EasyTravelHolyday.models.form.TransportUpdateForm;
import com.example.EasyTravelHolyday.repository.TransportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class TransportService implements BaseService<TransportDTO, Integer, Transport, TransportForm, TransportUpdateForm>{
    private final TransportMappeur transportMappeur;
    private final TransportRepository transportRepository;

    public TransportService(TransportMappeur transportMappeur, TransportRepository transportRepository) {
        this.transportMappeur = transportMappeur;
        this.transportRepository = transportRepository;
    }

    @Override
    public List<TransportDTO> getAll() {
        return transportRepository.findAll()
                .stream()
                .map(transportMappeur::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TransportDTO add(TransportForm toAdd) {
        return null;
    }

    @Override
    public TransportDTO remove(Integer integer) {
        return null;
    }

    @Override
    public TransportDTO uptate(Integer integer, TransportUpdateForm update) {
        return null;
    }

    @Override
    public TransportDTO findOne(Integer integer) {
        return null;
    }
}
