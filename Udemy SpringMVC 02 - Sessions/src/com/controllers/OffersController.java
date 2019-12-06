package com.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {
	
	@RequestMapping("/")
	public String showIndex(HttpSession session) {
		
		return "index";
	}
	
	@RequestMapping("/page1/")
	public String showPage1(HttpSession session) {
		
		session.setAttribute("sessionName1", "This is a session Attribute from Javas  HttpSession class");
		
		return "page1";
	}
	
	@RequestMapping("/page2/")
	public ModelAndView showPage2() {
		
		// The construcrt set a variable called ViewName. ie. The name of the View to render, to be resolved by the DispatcherServlet's ViewResolver
		ModelAndView mv = new ModelAndView("page2");
		
		Map<String, Object> model = mv.getModel();
		model.put("sessionName2", "sessionObjectFrom_ModelAndView_class");
		
		return mv;
	}
	
	@RequestMapping("/page3/")
	public String showPage3(Model model) {
		
		// Model is a spring Object passed to our controller for use. 
		model.addAttribute("sessionName3", "<b>sessionObjectFrom_Model_class</b>");
		
		return "page3";
	}
	
	@RequestMapping("/page4/")
	public String showPage4(Model model) {
		
		// Model is a spring Object passed to our controller for use. 
		model.addAttribute("sessionName4", "<b>sessionObjectFrom_Model_class</b>");
		
		return "page4";
	}

}
