package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
 
	@GetMapping("/welcome")
	public String welcome() {
		List<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("XYZ");
		List<String> newList=list.stream().filter(i->i.equalsIgnoreCase("XYZ")).collect(Collectors.toList());
		return newList.get(0);
	}
	
}
