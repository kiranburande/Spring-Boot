package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {

	@Override
	public void start() 
	{
		System.out.println("Petrol Engine is Started");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine is Stopped");
	}

}
