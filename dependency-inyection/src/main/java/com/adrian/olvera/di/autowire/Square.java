package com.adrian.olvera.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Square implements Figure{

	@Value("${square.radius")
	private double site;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return site*site;
	}

	

}
