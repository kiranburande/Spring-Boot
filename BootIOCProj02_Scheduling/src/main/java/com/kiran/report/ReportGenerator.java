package com.kiran.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("rg")
public class ReportGenerator 
{
	@Scheduled(initialDelay = 4000, fixedRate = 5000)
	public void generate()
	{
		System.out.println("Start Report on"+new Date());

		try {
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("End Report on"+new Date());
	}
}
