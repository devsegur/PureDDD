package com.example.batata.domain.service;

import com.example.batata.domain.pojo.Batata;
import com.example.batata.domain.repository.BatataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BatataService {

    public final BatataRepository batataRepository;

    public BatataService(BatataRepository batataRepository) {
        this.batataRepository = batataRepository;
    }


    public List<Batata> getBatatas(){

        return batataRepository.findAllBatatas();
    }

    public void createSomeBatata() {

        var obj = new Batata(UUID.randomUUID().toString(), UUID.randomUUID().toString());

        batataRepository.save(obj);
    }
}
