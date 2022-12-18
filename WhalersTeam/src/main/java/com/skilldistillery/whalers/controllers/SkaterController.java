package com.skilldistillery.whalers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.whalers.data.SkaterDAO;

@Controller
public class SkaterController {
	
	@Autowired
	private SkaterDAO whalersDAO;
	
	@RequestMapping(path= {"/", "home.do"})
	public String goToHome(Model model) {
		model.addAttribute("skater", whalersDAO.findAll());
		return "home";
	}
	
}
