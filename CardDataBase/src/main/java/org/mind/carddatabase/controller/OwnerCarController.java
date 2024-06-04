package org.mind.carddatabase.controller;

import lombok.RequiredArgsConstructor;
import org.mind.carddatabase.domain.Car;
import org.mind.carddatabase.repository.CarRepository;
import org.mind.carddatabase.repository.OwnerRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final OwnerRepository ownerRepository;
    private final CarRepository carRepository;

    @RequestMapping("/cars")
    public List<Car> getCars(){
        return carRepository.findAll();
    }
}
