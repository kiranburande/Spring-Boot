package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine {

	@Override
	public void start() 
	{
		System.out.println("Electric Engine is Started");
	}

	@Override
	public void stop() {
		System.out.println("Electric Engine is Stopped");
	}


}
