package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping("/dumpHello")
	String home() {
		return "Hello World, my first spring-boot Application";
	}
}
