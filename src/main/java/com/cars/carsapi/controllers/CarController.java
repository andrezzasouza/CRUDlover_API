package com.cars.carsapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

  @PutMapping("/{id}")
  public void updateCar(@PathVariable Long id, @RequestBody @Valid CarDTO req) {
    repository.findById(id).map(car -> {
      car.setModel(req.model());
      car.setManufacturer(req.manufacturer().getDescription());
      car.setManufactureDate(req.manufactureDate());
      car.setPrice(req.price());
      car.setYearModel(req.yearModel());
      return repository.save(car);
    });
  }

  @DeleteMapping("/{id}")
  public void deleteCar(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
