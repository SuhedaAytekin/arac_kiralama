package com.carrenatal.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.carrenatal.demo.dto.CarDTO;
import com.carrenatal.demo.model.Car;
import com.carrenatal.demo.repository.CarRepository;
import com.carrenatal.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//@Service
//public class CarServiceImpl implements CarService {
//
//    @Autowired
//    private CarRepository carRepository;
//
//    public void createOrUpdateCar(CarDTO empDto) {
//        Car emp = convertDtoToModel(empDto);
//        carRepository.save(emp);
//    }
//
//    public List<CarDTO> getAllCar() {
//        List<Car> list = carRepository.findAll();
//        List<CarDTO> carList = list.stream()
//                .map(CarDTO::new)
//                .collect(Collectors.toCollection(ArrayList::new));
//        return carList;
//    }
//
//    public void deleteCar(Long id) {
//        carRepository.deleteById(id);
//    }
//
//    public CarDTO editCar(Long id) {
//        Car emp = carRepository.getOne(id);
//        return convertModelToDTO(emp);
//    }
//
//    private Car convertDtoToModel(CarDTO empDto) {
//        Car emp = new Car();
//        if (empDto.getId() != null) {
//            emp.setId(empDto.getId());
//        }
//        emp.setAge(empDto.getAge());
//        emp.setBloodGp(empDto.getBloodGp());
//        emp.setEmailId(empDto.getEmailId());
//        emp.setEmpId(empDto.getEmpId());
//        emp.setFirstName(empDto.getFirstName());
//        emp.setLastName(empDto.getLastName());
//        emp.setMobileNo(empDto.getMobileNo());
//        emp.setPersonalEmail(empDto.getPersonalEmail());
//        emp.setUserName(empDto.getUserName());
//        return emp;
//    }
//
//    private CarDTO convertModelToDTO(Car emp) {
//        CarDTO empDTO = new CarDTO();
//        empDTO.setId(emp.getId());
//        empDTO.setAge(emp.getAge());
//        empDTO.setBloodGp(emp.getBloodGp());
//        empDTO.setEmailId(emp.getEmailId());
//        empDTO.setEmpId(emp.getEmpId());
//        empDTO.setFirstName(emp.getFirstName());
//        empDTO.setLastName(emp.getLastName());
//        empDTO.setMobileNo(emp.getMobileNo());
//        empDTO.setPersonalEmail(emp.getPersonalEmail());
//        empDTO.setUserName(emp.getUserName());
//        return empDTO;
//    }
//}

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    public void createOrUpdateCar(CarDTO empDto) {
        Car emp = convertDtoToModel(empDto);
        carRepository.save(emp);
    }

    public List<CarDTO> getAllCar() {
        List<Car> list = carRepository.findAll();
        List<CarDTO> carList = list.stream()
                .map(CarDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
        return carList;
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public CarDTO editCar(Long id) {
        Car emp = carRepository.getOne(id);
        return convertModelToDTO(emp);
    }

    private Car convertDtoToModel(CarDTO empDto) {
        Car emp = new Car();
        if (empDto.getId() != null) {
            emp.setId(empDto.getId());
        }
        emp.setYas(empDto.getYas());
        emp.setRenk(empDto.getRenk());
        emp.setPlaka(empDto.getPlaka());
        emp.setEmpId(empDto.getEmpId());
        emp.setMarka(empDto.getMarka());
        emp.setModel(empDto.getModel());
        emp.setMobileNo(empDto.getMobileNo());
        emp.setPersonalEmail(empDto.getPersonalEmail());
        emp.setVites(empDto.getVites());
        return emp;
    }

    private CarDTO convertModelToDTO(Car emp) {
        CarDTO empDTO = new CarDTO();
        empDTO.setId(emp.getId());
        empDTO.setYas(emp.getYas());
        empDTO.setRenk(emp.getRenk());
        empDTO.setPlaka(emp.getPlaka());
        empDTO.setEmpId(emp.getEmpId());
        empDTO.setMarka(emp.getMarka());
        empDTO.setModel(emp.getModel());
        empDTO.setMobileNo(emp.getMobileNo());
        empDTO.setPersonalEmail(emp.getPersonalEmail());
        empDTO.setVites(emp.getVites());
        return empDTO;
    }
}







