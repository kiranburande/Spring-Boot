package com.kiran.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("patientInfo")
@Data
public class PatientInfo 
{
	@Value("${pi.name}")
	private String patientName;
	@Value("${pi.addrs}")
	private String patientAddrs;
	@Value("${pi.contact}")
	private Long patientContact;
	@Value("#{${dc.xrayRate}+${dc.mriScanRate}}")
	private Double patientBill;
//	@Value("#{dc.ecgRate<=0}")
//	private Boolean ecgFree;
	@Value("${os.name}")
	private String osName;
}