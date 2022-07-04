package com.example.batata.infrastructure.repository;

import com.example.batata.application.entities.BatataEntity;
import com.example.batata.domain.pojo.Batata;
import com.example.batata.domain.repository.BatataRepository;
import com.example.batata.infrastructure.mapper.BatataMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BatataRepositoryImpl extends BatataRepository, JpaRepository<BatataEntity, Long> {

  BatataMapper mapper = new BatataMapper();

  @Override
  @Transactional(readOnly = true)
  default List<Batata> findAllBatatas() {
    return mapper.mapOut(findAll());
  }

  @Override
  @Transactional
  default void save(Batata obj) {
    var toSave = mapper.mapIn(List.of(obj));

    saveAll(toSave);
  }
}
