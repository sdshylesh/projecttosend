package com.harman.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harman.demo.emp.Vehicle;


@Repository
public interface Vehiclerepository  extends JpaRepository<Vehicle, Integer> {

}
