package com.kiran.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dCenterCatalog")
@Data
public class DiagnosticCenterCatalog 
{
	@Value("${dc.xrayRate}")
	private Double xrayRate;
	@Value("${dc.ctscanRate}")
	private Double ctscanRate;
	@Value("${dc.mriScanRate}")
	private Double mriScanRate;
	@Value("${dc.ecgRate}")
	private Double ecgRate;
	
}
