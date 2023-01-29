package com.harman.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harman.demo.dao.Vehiclerepository;

import com.harman.demo.emp.Vehicle;

@Service
public class Vehicle_service {
	@Autowired
	private Vehiclerepository vehser;
	
	public String saving(Vehicle emp)
	{
		vehser.save(emp);
		return "saved";
	}
	public List<Vehicle> getall()
	{
//		 List<Vehicle>  l1= new ArrayList<Vehicle> ();  
		
		return vehser.findAll();
	}
	public String delid(Integer year)
	{
	 
	    vehser.deleteById(year);
		return "deleted";
		
	}

	

}
