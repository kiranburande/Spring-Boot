package com.kiran.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("eengine")
//@Primary
public class ElectricEngine implements IEngine {

	@Override
	public void start() 
	{
		System.out.println("Electric Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Electric Engine Stopped");
		}

}
