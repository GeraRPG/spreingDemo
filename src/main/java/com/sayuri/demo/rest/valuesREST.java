package com.sayuri.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("values")
public class valuesREST {
	//@GetMapping
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello Word";
	}
}
