package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine {

	@Override
	public void start() 
	{
		System.out.println("Diesel Engine is Started");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine is Stopped");
	}

}
