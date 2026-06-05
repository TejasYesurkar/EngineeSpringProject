package com.example.Engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Engine.enginee.PetrolEngine;

@SpringBootApplication
public class EngineApplication {

	public static void main(String[] args) {
		PetrolEngine petrol = new PetrolEngine();
		var engineRunner = new EnigneeRunner(petrol);
		engineRunner.run();
//Commmented Code
	}

}
