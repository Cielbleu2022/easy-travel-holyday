package com.example.EasyTravelHolyday.repository;

import com.example.EasyTravelHolyday.models.dto.AdresseDTO;
import com.example.EasyTravelHolyday.models.entity.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse,Long> {
}
