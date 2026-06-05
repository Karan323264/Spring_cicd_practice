package com.bound.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CiCdController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from CI/CD practice.. Welcome to the world of DevOps and Continuous Integration/Continuous Deployment!";
	}
}
