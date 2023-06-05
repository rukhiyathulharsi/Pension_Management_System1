package com.mongo.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.example.entity.Pension;
import com.mongo.example.repo.IPensionRepo;

@Service
public class PensionServiceImpl implements IPensionService{
	
	@Autowired
	private IPensionRepo iPensionRepo;


	@Override
	public void deletepens(Pension pension) {
		// TODO Auto-generated method stub
		 iPensionRepo.delete(pension);	
	}

	@Override
	public List<Pension> getPension() {
		// TODO Auto-generated method stub
		List<Pension> pension=this.iPensionRepo.findAll();
		System.out.println("Getting employees from databases: "+pension);
		return pension;
	}

	@Override
	public Pension addPension(Pension pension) {
		// TODO Auto-generated method stub
		return this.iPensionRepo.save(pension);
	}
	

}
