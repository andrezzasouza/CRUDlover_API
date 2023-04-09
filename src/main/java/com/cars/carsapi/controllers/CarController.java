package com.cars.carsapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.carsapi.DTO.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {

  @PostMapping
  public void createCar(@RequestBody CarDTO req) {
    System.out.println("O carro " + req.modelo() + " foi fabricado em " + req.dataFabricacao() + " e custa R$ " + req.valor() + ",00");
  }
}
