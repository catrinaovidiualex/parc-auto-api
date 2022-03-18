package ro.mycode.parcautoapi;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.mycode.parcautoapi.model.Car;
import ro.mycode.parcautoapi.repository.CarRepository;

@SpringBootApplication
public class ParcAutoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParcAutoApiApplication.class, args);
    }


 /*   @Bean
    CommandLineRunner commandLineRunner (CarRepository carRepository){
        return arg ->{
            Faker faker = new Faker();

           for(int i=1;i<=10;i++){
               Car c= new Car();

               c.setIdM(faker.);

                carRepository.save(c);
           }
        };
    }*/
}
