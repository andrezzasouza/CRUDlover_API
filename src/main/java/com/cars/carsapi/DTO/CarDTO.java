package com.cars.carsapi.DTO;

import java.util.Date;

import com.cars.carsapi.models.Manufacturer;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

public record CarDTO(
    @NotBlank String model,
    @NotNull Manufacturer manufacturer,
    @Past Date manufactureDate,
    @NotNull @Positive int price,
    @Min(1950) @Max(2023) int yearModel) {
}
