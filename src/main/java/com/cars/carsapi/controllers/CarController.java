package com.cars.carsapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.carsapi.DTO.CarDTO;
import com.cars.carsapi.models.Car;
import com.cars.carsapi.repositories.CarRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/car")
public class CarController {

  @Autowired
  private CarRepository repository;

  @GetMapping
  public List<Car> listAllCars() {
    return repository.findAll();
  }

  @PostMapping
  public void createCar(@RequestBody @Valid CarDTO req) {
    System.out.println("O carro " + req.model() + " foi fabricado em " + req.manufactureDate() + " e custa R$ " + req.price() + ",00");
    System.out.println("Cadastrado com sucesso!");
    repository.save(new Car(req));
  }
}
