package ro.mycode.parcautoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.mycode.parcautoapi.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
