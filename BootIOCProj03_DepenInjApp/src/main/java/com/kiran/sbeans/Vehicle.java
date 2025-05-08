package com.kiran.sbeans;

import com.kiran.BootIocProj03DepenInjAppApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle 
{

    private final BootIocProj03DepenInjAppApplication bootIocProj03DepenInjAppApplication;
	@Autowired
	@Qualifier("pengine")
	private IEngine engine;

	public Vehicle(BootIocProj03DepenInjAppApplication bootIocProj03DepenInjAppApplication) {
		super();
		this.bootIocProj03DepenInjAppApplication = bootIocProj03DepenInjAppApplication;
	}
	
	public void journey(String sourcePlace, String destinationPlace)
	{
		engine.start();
		System.out.println("journey started from "+sourcePlace);
		
		System.out.println("journey is going on...");
		
		engine.stop();
		System.out.println("journey ended at "+destinationPlace);
	}
	
}
