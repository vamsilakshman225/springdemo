package com.springbdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
@GetMapping("/")
public String message() {
	return "Hello World";
}
@GetMapping("/product/{id}")
public String product(@PathVariable("id")int id) {
	if(id==1)
		return "product found";
	else
		return "product not found";
}
}
