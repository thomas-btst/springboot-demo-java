package net.imt.atlantique.fil.demo.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.imt.atlantique.fil.demo.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/")
	public String index() {
		return helloService.getHelloWorld();
	}

}