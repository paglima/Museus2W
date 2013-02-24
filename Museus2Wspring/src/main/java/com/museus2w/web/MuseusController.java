package com.museus2w.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.museus2w.service.UserAppService;

@Service
@Controller
@RequestMapping("/inclui")
public class MuseusController extends MultiActionController {

	@RequestMapping(method = RequestMethod.GET)
	
	public String ModelAndView (HttpServletRequest request,
	        HttpServletResponse response) throws Exception {
		
		String login = (String) request.getParameter("login");
		String senha = (String) request.getParameter("senha");	
		return "index";
	}

}