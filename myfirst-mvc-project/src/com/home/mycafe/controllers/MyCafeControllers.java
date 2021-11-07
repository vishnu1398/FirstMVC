package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	
	//Return welcome page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model)
	{
		//sending data to view
		String myName="Vishnupriyan";
		
		model.addAttribute("myNameValue", myName);
		model.addAttribute("myWebsiteTitle", "Mom's Cafe");
		
		return "welcom-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model)
	{
		//handle data received from user
		String userEnteredValue = request.getParameter("foodType");
		model.addAttribute("userInput", userEnteredValue);
		
		return "process-order";
	}
	
}
