package com.skilldistillery.whalers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping("updateSkater.do")
	public void updateSkater(Skater fid,  Model model) {
//		Skater s = whalersDAO.findById(skater.getId());
//		System.out.println(fid.toString());
//		model.addAttribute("skater", s);
		goToHome(model);
	}
	@PostMapping()
	public boolean delete(int skaterId) {
		boolean deletedSkater = false;
		Skater s = skaterDAO.findById(skaterId);
		if(s != null) {
			deletedSkater = skaterDAO.delete(skaterId);
		}
		return deletedSkater;
	}
	
	@GetMapping("addSkater.do")
	public Skater addSkater(Skater skater) {
		Skater newGuy = skaterDAO.create(skater);
		return newGuy;
	}
}
