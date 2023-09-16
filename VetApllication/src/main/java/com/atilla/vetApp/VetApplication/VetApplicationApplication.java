package com.atilla.vetApp.VetApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, WebMvcAutoConfiguration.class })
@ComponentScan({ "com.atilla.vetApp.VetApplication.repository"})
public class VetApplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetApplicationApplication.class, args);
	}

}
