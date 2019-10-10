package com.pranavkapoorr.schedular;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldSchedular {
	
	@Scheduled(fixedDelay = 5000)
	public void sayHello() {
		System.out.println("Hello World! at " + new Date());
	}
}
