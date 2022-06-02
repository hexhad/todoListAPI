package com.hashan.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableSwagger2
public class TodoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		System.out.println("\nPATH -> http://localhost:8081/api");
		System.out.println("\nSWAGGER -> http://localhost:8081/api/swagger-ui.html\n");
	}
}
