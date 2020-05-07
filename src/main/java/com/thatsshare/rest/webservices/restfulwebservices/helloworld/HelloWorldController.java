package com.thatsshare.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public HelloWorldBean index() {
		return new HelloWorldBean("Test Api");
	}
	@GetMapping(path = "/api")
	public HelloWorldBean helloWorldApi() {
		return new HelloWorldBean("Hello World");
	}
	@GetMapping(path = "/hello-world")
	public HelloWorldBean helloWorld() {
		return new HelloWorldBean("Hello World");
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
