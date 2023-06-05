package com.mongo.example.service;

import java.util.List;

import com.mongo.example.entity.Pension;

public interface IPensionService {

	void deletepens(Pension pension);

	List<Pension> getPension();

	Pension addPension(Pension pension);

}
