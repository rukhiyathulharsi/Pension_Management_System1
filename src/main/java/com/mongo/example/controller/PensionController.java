package com.mongo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mongo.example.entity.Pension;
import com.mongo.example.repo.IPensionRepo;

import com.mongo.example.service.IPensionService;

public class PensionController {
	
@Autowired IPensionService iPensionService;
	
	@Autowired IPensionRepo iPensionRepo;
	
	@PostMapping("/pensn")
	public Pension addPension(@RequestBody Pension pension){
		return iPensionService.addPension(pension);
		
	}
	
	@GetMapping("/getpension")
	public List<Pension> getPension() {
		return iPensionService.getPension();
	}

	
	@DeleteMapping("/remove")
	public Pension removePension(@RequestBody Pension pension) {
		iPensionService.deletepens(pension);
		return pension;
	}
	
	

}
