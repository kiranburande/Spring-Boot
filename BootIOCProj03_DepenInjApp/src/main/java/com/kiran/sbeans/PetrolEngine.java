package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("pengine")
public class PetrolEngine implements IEngine
{

	@Override
	public void start() {
		System.out.println("Petrol Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine Stopped");
	}

}
