package com.cars.carsapi.models;

import com.cars.carsapi.DTO.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {
  
  public Car(CarDTO req) {
    this.model = req.model();
    this.manufacturer = req.manufacturer().getDescription();
    this.price = req.price();
    this.yearModel = req.yearModel();
    this.manufactureDate = req.manufactureDate();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column (length = 100, nullable = false)
  private String model;
  
  @Column(nullable = false)
  private String manufacturer;

  @Column(length = 10, nullable = false)
  private String manufactureDate;

  @Column(nullable = false)
  private int price;

  @Column(length = 4, nullable = false)
  private int yearModel;
}
