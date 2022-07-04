package com.example.batata.application.controller;

import com.example.batata.domain.pojo.Batata;
import com.example.batata.domain.service.BatataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BatataController {

  private final BatataService batataService;

  public BatataController(BatataService batataService) {
    this.batataService = batataService;
  }

  @GetMapping
  public List<Batata> getBatatas() {

    return batataService.getBatatas();
  }

  @PostMapping
  public ResponseEntity<HttpStatus> createBatata(){
      batataService.createSomeBatata();

      return ResponseEntity.status(HttpStatus.CREATED).build();
  }

}
