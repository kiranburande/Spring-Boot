package com.kiran.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle 
{
	@Autowired
	@Qualifier("motor")
	private IEngine engine;
	
	public void journey(String startLoc,String endLoc)
	{
		engine.start();
		System.out.println("Journey Started at :"+startLoc);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Jouney Ended at :"+endLoc);
		engine.stop();
	}
}
