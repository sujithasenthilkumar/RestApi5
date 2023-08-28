package com.name.name.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


	public class name{
		@GetMapping("/name")
		public String name(){
			return"welcome name";
		
	}


}
