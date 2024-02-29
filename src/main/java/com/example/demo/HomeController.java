package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("home")
	//	@ResponseBody -- If we want to return the string/data using return statement
	// Use application.properties to set the prefix and suffix of the files which are stored in a different path other than webapp.
	public String home(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		String name = req.getParameter("name"); // name is URL parameter
		System.out.println("Home coming - " + name);
		
		session.setAttribute("name", name);
		
// 		Request dispatcher - Servlet and JSP shares the same request
		
//		req.setAttribute(name, name); one way to pass params to JSP
		return "home"; // use home.jsp without @ResponseBody to return the JSP as a servlet
		
		
		
		
		
	}
}
