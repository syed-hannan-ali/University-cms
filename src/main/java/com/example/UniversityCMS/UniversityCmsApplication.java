package com.example.UniversityCMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class UniversityCmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(UniversityCmsApplication.class, args);
	}

}
