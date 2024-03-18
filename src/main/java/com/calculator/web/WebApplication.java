package com.calculator.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication anotacija yra lygi @Configuration, @EnableAutoConfiguration ir @ComponentScan
// Nurodoma klaseje, turincioje pagrindini (main) metoda
@SpringBootApplication
//Web controller'is. Zymi MVC valdikli. Leidzia viduje naudoti anotacijas kaip @RequestMapping
//@RestController anotacija nurodo, jog String tipo rezultatas turetu buti isspausdinamas toks koks yra
@RestController
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		System.out.println("Hello SPRING here's my BOOT");
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return  String.format("Hello %s!", name);
	}

}
