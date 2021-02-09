package com.carrenatal.demo.service;

import com.carrenatal.demo.dto.CarDTO;

import java.util.List;



public interface CarService {

    public void createOrUpdateCar(CarDTO empDTO);

    public List<CarDTO> getAllCar();

    public void deleteCar(Long id);

    public CarDTO editCar(Long id);

}
