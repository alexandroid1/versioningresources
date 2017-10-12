package com.bootversioningresources.versioningresources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class VersioningresourcesApplication {

	@RequestMapping("/thymeleaf")
	public String tleaf() {
		return "template";
	}

	public static void main(String[] args) {
		SpringApplication.run(VersioningresourcesApplication.class, args);
	}
}
