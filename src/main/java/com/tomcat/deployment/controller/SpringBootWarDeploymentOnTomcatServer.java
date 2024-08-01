package com.tomcat.deployment.controller;

// Java Program to Illustrate SpringBoot WarDeployment
// On Tomcat Server

// Importing required classes

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// Annotation
@SpringBootApplication

// Class
public class SpringBootWarDeploymentOnTomcatServer extends SpringBootServletInitializer {
	@Override
// Configuring method has to be overridden 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWarDeploymentOnTomcatServer.class);
	}

// Method 2 
// Main driver method 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarDeploymentOnTomcatServer.class, args);
	}
}
