package com.cars.carsapi.DTO;

import com.cars.carsapi.models.Manufacturer;

public record CarDTO(
  String model, 
  Manufacturer manufacturer, 
  String manufactureDate, 
  int price, 
  int yearModel) {
}
