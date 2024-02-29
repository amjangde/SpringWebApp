package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("home")
//	@ResponseBody -- If we want to return the string/data using return statement
	public String home()
	{
		System.out.println("Home coming");
		return "home"; // use home.jsp without @ResponseBody to return the JSP as a servelet
		
		// Use application.properties to set the prefix and suffix of the files which are stored in a different path other than webapp.
	}
}
