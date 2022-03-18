package ro.mycode.parcautoapi.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.mycode.parcautoapi.model.Car;
import ro.mycode.parcautoapi.repository.CarRepository;

import java.util.List;

@RestController
@CrossOrigin
public class CarController {

    private CarRepository carRepository;

    public CarController (CarRepository carRepository){
        this.carRepository=carRepository;
    }

    @GetMapping("/alex")

    public ResponseEntity<List<Car>>getAll(){
        return new ResponseEntity<>(carRepository.findAll(), HttpStatus.ACCEPTED);

    }

}
