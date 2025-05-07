package com.kiran;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootIocProj01SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootIocProj01SchedulingApplication.class, args);
		System.out.println("Main method started"+new Date());
	}

}
