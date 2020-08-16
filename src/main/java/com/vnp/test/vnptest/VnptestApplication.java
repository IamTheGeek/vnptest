package com.vnp.test.vnptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VnptestApplication {

	public static void main(String[] args) {
		SpringApplication.run(VnptestApplication.class, args);
		System.out.println("Checkin-1");
		System.out.println("Checkin-2");
		System.out.println("Checkin-3 to feature branch");
	}

}
