package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {
	
	@Autowired
	private DeviceRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		repository.deleteAll();
	
		//save a couple of customers
		repository.save(new Device("xxxxxxxx","xxxxxxxxx","xxxxxxxxxxx"));
		repository.save(new Device("yyyyyy","yyyyyyyyyyy","yyyyyyyyyyy"));
		
		//fetch all customers
		
		System.out.println("Device found with findAll(): ");
		System.out.println("-----------------------------------");
		for(Device device: repository.findAll())
		{
			System.out.println(device);
		}
		
	
	}

}
