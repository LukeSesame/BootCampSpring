package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	
	@RequestMapping("/information") //chemin spécifié lors de la saisie dans l'url
	public String info(Model model) { //Nom de la méthode
	
		String formation ="Fullstack";
		System.out.println("Methode information");

		
		ArrayList <String> List = new ArrayList<>(); 
			 List.add("OCA");
			 List.add("OCP");
			 List.add("Spring");
			 List.add("Angular");
		
		model.addAttribute("workshop", formation);
		model.addAttribute("exercice", List);	 
		
			
		return "home/info";//le nom (chemin) de la vue sous template
	}
	
	@RequestMapping("/affichage")
	public String Afficher() {
	
		
		System.out.println("Methode affichage");
		return "home/affichage";
	}
	
}
