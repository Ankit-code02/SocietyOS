package com.societyos.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {

		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

		System.out.println("user.timezone = " + System.getProperty("user.timezone"));
		System.out.println("default timezone = " + TimeZone.getDefault().getID());

		SpringApplication.run(BackendApplication.class, args);
	}
}