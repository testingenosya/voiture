package Tomonil.vaika.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Tomonil.vaika.models.Car;

public interface CarRepository extends JpaRepository<Car,Long> {

}
