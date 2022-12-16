package com.skilldistillery.whalers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.whalers.data.WhalersDAO;

@Controller
public class WhalersController {
	
	@RequestMapping(path= {"/", "home.do"})
	public String goToHome(Model model) {
		return "home";
	}
	@Autowired
	private WhalersDAO dao;
}
