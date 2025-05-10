package com.kiran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.kiran.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/kiran/cfgs/applicationContext.xml")
public class BootIocProj04DependencyInjLooselyCoupledApplication {

    private final Vehicle vehicle;

    BootIocProj04DependencyInjLooselyCoupledApplication(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj04DependencyInjLooselyCoupledApplication.class, args);
		Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("Mumbai", "Delhi");
		((ConfigurableApplicationContext) ctx).close();
	}
}
