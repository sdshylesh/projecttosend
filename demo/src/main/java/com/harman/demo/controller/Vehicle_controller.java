package com.harman.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harman.demo.emp.Vehicle;
import com.harman.demo.service.Vehicle_service;

@Controller
@RequestMapping("/vehi")
public class Vehicle_controller {
	@Autowired
	private Vehicle_service vehcon;
	
	@RequestMapping("/save") 
	public ResponseEntity<String> saving(@RequestBody Vehicle emp)
	{
		String e1=vehcon.saving(emp);
		if(e1.equals("saved"))
		{
			return ResponseEntity.status(200).body(e1);
		}
		return ResponseEntity.status(400).body(null);
		
	}
	@RequestMapping("/getall") 
	public ResponseEntity<List<Vehicle> > getall()
	{
		List<Vehicle>  e1=vehcon.getall();
	
		
			return ResponseEntity.status(200).body(e1);
	
		
	}
	
	
	
	
	@RequestMapping("/delete/{year}")
	public ResponseEntity<String> delid(@PathVariable int year)
	{
		String e4=vehcon.delid(year);
		if(e4.equals("deleted"))
		{
			return ResponseEntity.status(200).body("deleted");
		}
		return ResponseEntity.status(400).body("no item");
	}
	
	@RequestMapping("/editing") 
	public ResponseEntity<String> editing(@RequesHeaders )
	{
		String e1=vehcon.saving(emp);
		if(e1.equals("saved"))
		{
			return ResponseEntity.status(200).body(e1);
		}
		return ResponseEntity.status(400).body(null);
		
	}
	

}
