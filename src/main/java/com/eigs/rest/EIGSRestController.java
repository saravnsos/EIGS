package com.eigs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EIGSRestController {

	@GetMapping(path = "/welcome")
	public String welcomeController()
	{
		return "Hi we are welcome";
	}
}
