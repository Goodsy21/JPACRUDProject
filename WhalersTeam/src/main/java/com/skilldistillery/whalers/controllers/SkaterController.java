package com.skilldistillery.whalers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.whalers.data.SkaterDAO;
import com.skilldistillery.whalers.entities.Skater;

@Controller
public class SkaterController {
	
	@Autowired
	private SkaterDAO skaterDAO;
	
	@RequestMapping(path= {"/", "home.do"})
	public String goToHome(Model model) {
		model.addAttribute("skater", skaterDAO.findAll());
		return "home";
	}
	@GetMapping("updatePlayer.do")
	public String goToSkater(@RequestParam int fid, Model model) {
		Skater s = skaterDAO.findById(fid);
		System.out.println(s.toString());
		model.addAttribute("skater", s);
		return "updateSkater";
	}
	
	@PostMapping(path="updateSkater.do", params= {"id", "firstName", "lastName", "number", "position", "hometown"})
	public String updateSkater(int id, String firstName, String lastName, int number, String position, String hometown) {
		Skater newSkater = new Skater();
		newSkater.setFirstName(firstName);
		newSkater.setLastName(lastName);
		newSkater.setNumber(number);
		newSkater.setHometown(hometown);
		newSkater.setPosition(position);
		skaterDAO.update(id, newSkater);
		
		return "playerEditedConfirmation";
		
	}
	@GetMapping("deleteSkater.do")
	public String delete(@RequestParam int fid) {
		boolean deletedSkater = false;
		Skater s = skaterDAO.findById(fid);
		if(s != null) {
			skaterDAO.delete(fid);
		}
		return "deleteConfirmation";
	}
	
	@GetMapping("createSkater.do")
	public String addSkater() {
//		Skater newGuy = skaterDAO.create(skater);
		return "createSkater";
	}
	@PostMapping(path="createSkater.do", params= {"firstName", "lastName", "number", "position", "hometown"})
	public String createSkater(String firstName, String lastName, int number, String position, String hometown) {
		Skater skater = new Skater();
		skater.setFirstName(firstName);
		skater.setLastName(lastName);
		skater.setHometown(hometown);
		skater.setNumber(number);
		skater.setPosition(position);
		skaterDAO.create(skater);
		return "playerCreatedConfirmation";
	}
}
