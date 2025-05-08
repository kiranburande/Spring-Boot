package com.kiran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kiran.sbeans.Vehicle;

@SpringBootApplication
public class BootIocProj03DepenInjAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj03DepenInjAppApplication.class, args);
		Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("Hyderabad", "Pune");
		((ConfigurableApplicationContext) ctx).close();
	}

}
