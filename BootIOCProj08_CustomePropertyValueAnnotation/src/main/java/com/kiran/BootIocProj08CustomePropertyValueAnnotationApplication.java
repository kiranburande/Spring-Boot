package com.kiran;

import com.kiran.sbeans.DiagnosticCenterCatalog;
import com.kiran.sbeans.PatientInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "com/kiran/commons/hospital.properties")
public class BootIocProj08CustomePropertyValueAnnotationApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx= SpringApplication.run(BootIocProj08CustomePropertyValueAnnotationApplication.class, args);
		PatientInfo pInfo = ctx.getBean("patientInfo",PatientInfo.class);
		DiagnosticCenterCatalog dcc = ctx.getBean("dCenterCatalog",DiagnosticCenterCatalog.class);
		System.out.println(pInfo);
		System.out.println(dcc);
		((ConfigurableApplicationContext) ctx).close();
	}
}
