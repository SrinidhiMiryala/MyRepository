package com.ex;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppointmentController {
	
	@RequestMapping("/patient_register")
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response) {
		String name= request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String mobile = request.getParameter("phone");
		String address = request.getParameter("address");
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("email", email);
		mv.addObject("address", address);
		mv.addObject("mobile", mobile);
		
		mv.setViewName("display");
		
		return mv;
		
		
	
	}

}
