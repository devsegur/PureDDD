package com.example.batata.infrastructure.mapper;

import com.example.batata.application.entities.BatataEntity;
import com.example.batata.domain.pojo.Batata;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BatataMapper {

  public List<Batata> mapOut(List<BatataEntity> all) {
    return all.stream()
        .map(
            batataEntity ->
                new Batata(
                    batataEntity.getId(), batataEntity.getNome(), batataEntity.getSabor()))
        .collect(Collectors.toList());
  }

  public List<BatataEntity> mapIn(List<Batata> all) {
    return all.stream()
        .map(batataEntity -> new BatataEntity(batataEntity.getNome(), batataEntity.getSabor()))
        .collect(Collectors.toList());
  }
}
