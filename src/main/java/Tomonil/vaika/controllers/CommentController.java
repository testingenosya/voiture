package Tomonil.vaika.controllers;


import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Tomonil.vaika.models.Comment;
import Tomonil.vaika.repo.CommentRepository;

@Controller
public class CommentController {
	@Autowired
	CommentRepository comR;
	
	@RequestMapping(value = "/add-comment", method = RequestMethod.GET)
	public String showTeamPage(ModelMap model,@RequestParam long idCar) {
		model.addAttribute("idCar",idCar);
		model.addAttribute("comment",new Comment());
		
		return "add-comment";
	}
	@RequestMapping(value = "/add-comment", method = RequestMethod.POST)
	public String addCommentPage(@ModelAttribute("comment") Comment comment,ModelMap model) {
		comR.save(comment);
		
		return "redirect:/";
	}
}
