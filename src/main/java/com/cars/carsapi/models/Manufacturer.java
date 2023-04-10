package com.cars.carsapi.models;

public enum Manufacturer {
	FIAT("Fiat"),
	HONDA("Honda"),
	RENAULT("Renault"),
  BMW("BMW"),
  FORD("Ford"),
  HYUNDAI("Hyundai"),
  TOYOTA("Toyota"),
  CHEVROLET("Chevrolet"),
  CITROEN("Citroën"),
  VOLKSWAGEN("Volkswagen"),
  NISSAN("Nissan"),
  PEUGEOT("Peugeot"),
  MITSUBISHI("Mitsubishi"),
  JEEP("Jeep");

	private String description;

	Manufacturer(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
