package Tomonil.vaika.controllers;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Tomonil.vaika.services.CarService;

@Controller
public class CarController {
	@Autowired
	private CarService carS;
	
	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}
	private String getLoggedInIdUser(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showTeamPage(ModelMap model) {
		model.addAttribute("cars",carS.getCarR().findAll());
		model.addAttribute("user",getLoggedInUserName(model));
		if(getLoggedInUserName(model) == "anonymousUser") {
		}
		else {
			model.addAttribute("srv2",carS);
		}
		return "team";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		String val = "redirect:/list-car";
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");
			val = "/login";
			
		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");
			val = "/login";
			
		return val;
	}
}
