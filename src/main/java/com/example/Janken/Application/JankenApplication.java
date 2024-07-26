package com.example.Janken.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JankenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JankenApplication.class, args);
	}

	@RestController
	public class MyController {
		@GetMapping("/")
		public String message() {
			return "This is Jenkins server..";
		}
	}
}
