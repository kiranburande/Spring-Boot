package com.kiran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kiran.sbeans.Hotel;

@SpringBootApplication
public class BootIocProj05ValueAnnotationSpelApplication 
{
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj05ValueAnnotationSpelApplication.class, args);
		Hotel hotel = ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		((ConfigurableApplicationContext) ctx).close();
	}

}
