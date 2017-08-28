package com.projects.foodtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
//import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class FoodtrackerApplication extends SpringBootServletInitializer {
	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    //	return super.configure(application);
        return application.sources(FoodtrackerApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(FoodtrackerApplication.class, args);
	}
}
