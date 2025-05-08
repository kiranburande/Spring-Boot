package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("dengine")
public class DesielEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("Diesel Engine Started");

	}

	@Override
	public void stop() 
	{
		System.out.println("Diesel Engine Stopped");
	}

}
