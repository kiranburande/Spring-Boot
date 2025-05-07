package com.kiran.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder 
{
	      @Autowired
          private LocalDate date;
	      
	      
	     //buissness method
	      public String getSeason() {
	    	  System.out.println("SeasonFinder.getSeason()");
	    	  int mv = date.getMonthValue();
	    	  if(mv>=3 && mv <=6)
	    		  return "Summer";
	    	  if(mv>=7 && mv<=10)
	    		  return "Rainy";
	    	  else 
	    		  return "Winter";
	      }
} 
