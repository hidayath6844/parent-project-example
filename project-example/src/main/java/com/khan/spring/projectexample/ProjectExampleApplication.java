package com.khan.spring.projectexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.khan.spring.projectexamplemessaging.Project;

@SpringBootApplication
public class ProjectExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectExampleApplication.class, args);
		Project project = new Project();
		 
	}
}
