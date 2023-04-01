package com.example.dockerjenkins.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker-jenkins")
public class DockerJenkins {

	@GetMapping
	public String find() {

		return "Docker Jenkins Integration";
	}
}
