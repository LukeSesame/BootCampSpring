package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	
	@RequestMapping("/information") //chemin spécifié lors de la saisie dans l'url
	public String info(Model model) { //Nom de la méthode
	
		String formation ="Fullstack";
		System.out.println("Methode information");
		model.addAttribute("workshop", formation);
		
		return "home/info";//le nom (chemin) de la vue sous template
	}
	
	@RequestMapping("/affichage")
	public String Afficher() {
	
		
		System.out.println("Methode affichage");
		return "home/affichage";
	}
	
}
