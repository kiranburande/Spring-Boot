package com.kiran.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("hotel")
@ToString
//@ImportResource("application.properties")
public class Hotel 
{
	@Value("${hotel.id}")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.addr}")
	private String hotelAddr;
	@Value("${hotel.contact}")
	private String contactNo;
	
	@Value("customer.name")
	private  String customerName;
	@Value("#{${menu.idlyPrice}+${menu.dosaPrice}}1")
	private Float billAmt;
	
	@Value("${os.name}")
	private String osName;	
	@Value("${user.name}")
	private String windowsUser;
	
	@Value("${Path}")
	private String pathData;
}
