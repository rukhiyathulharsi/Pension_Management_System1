package com.mongo.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mongo.example.entity.Pension;
import com.mongo.example.repo.IPensionRepo;
import com.mongo.example.service.PensionServiceImpl;


@SpringBootTest
class PensionManagementSystem1ApplicationTests {

	@Autowired
	private PensionServiceImpl pensionServiceImpl;

	@MockBean
	private IPensionRepo pensionRepo;

	@Test
	public void addPensionTest() {
		Pension pension =new  Pension(1234, "Ram", "11/12/2000", 7652,23000,200,"self","hdfc",87656,"public");
		when(pensionRepo.save(pension)).thenReturn(pension);
		assertEquals(pension, pensionServiceImpl.addPension(pension));
	}
	
	@Test
	public void deletePensionTest() {
		Pension pension = new Pension(1234, "Ram", "11/12/2000", 7652,23000,200,"self","hdfc",87656,"public");
		pensionServiceImpl.deletepens(pension);
		verify(pensionRepo, times(1)).delete(pension);
	}
	
	@Test
	public void getPensionTest() {
		when(pensionRepo.findAll()).thenReturn(Stream.of(new Pension(1234, "Ram", "11/12/2000", 7652,23000,200,"self","hdfc",87656,"public"),
				new Pension(1254, "Rahul", "11/12/2000", 7652,23000,200,"self","hdfc",87656,"public"),
				new Pension(2345, "Virat", "11/12/2000", 7652,23000,200,"self","hdfc",87656,"public")
				).collect(Collectors.toList()));
		assertEquals(3,pensionServiceImpl.getPension().size());
	}


}
