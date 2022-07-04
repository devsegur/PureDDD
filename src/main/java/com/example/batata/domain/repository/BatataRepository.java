package com.example.batata.domain.repository;

import com.example.batata.domain.pojo.Batata;

import java.util.List;

public interface BatataRepository {

  List<Batata> findAllBatatas();

  void save(Batata obj);
}
