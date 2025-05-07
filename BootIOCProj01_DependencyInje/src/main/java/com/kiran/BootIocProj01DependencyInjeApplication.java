package com.kiran;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractXmlApplicationContext;

import com.kiran.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01DependencyInjeApplication {
	  
	@Bean
	public LocalDate createDate() {
		System.out.println("BootIocProj01DependencyInjeApplication.createDate()");
		return LocalDate.now();
	}
	
	

	public static void main(String[] args) 
	{
		System.out.println("BootIocProj01DependencyInjeApplication.main()");
	ApplicationContext ctx = SpringApplication.run(BootIocProj01DependencyInjeApplication.class, args);
	
	SeasonFinder s=ctx.getBean("sf",SeasonFinder.class);
	
	String season = s.getSeason();
	
	System.out.println(season);
	 
	((ConfigurableApplicationContext)(ctx)).close();
		
	}

}
