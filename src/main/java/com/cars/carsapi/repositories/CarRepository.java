package com.cars.carsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.carsapi.models.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}


// TODO Listar
// TODO Deletar
// TODO Atualizar