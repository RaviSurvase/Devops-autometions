package com.example.Janken.Application;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsApplication {
//    public static Logger logger=  LoggerFactory.getLogger(JenkinsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

	@RestController
	public class MyController {
		@GetMapping("/")
		public String message() {
			return "This is Jenkins server..";
		}
	}
}
