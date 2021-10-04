package com.example.PracticeWebAppDemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	
//In general HttpServletRequest and Response are used
/*	@RequestMapping("home")
	public String home(HttpServletRequest req)//HttpServletResponse res is used for response variable
	{

		//HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Hi " + name);
		req.setAttribute("name", name);
		//session.setAttribute("name", name); we can pass the value to the jsp page as session variable
		
		return "Home";
	}*/
	
//Spring boot makes it easier	
/*	@RequestMapping("home")
	public ModelAndView home(String name) //public String home(String name,HttpSession session)
	{

		ModelAndView  mv = new ModelAndView(); //In this case home will return ModelAndView datatype and we do not need an Httpsession variable
		mv.addObject("name", name);
		mv.setViewName("Home");
		
//    session.setAttribute("name", name); 
		
		return mv; //Here we will return mv
	}*/
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien)
	{
		ModelAndView  mv = new ModelAndView();
		mv.addObject("Obj", alien);
		mv.setViewName("Home");
		return mv;
	}
	
}
