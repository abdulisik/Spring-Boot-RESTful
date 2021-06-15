package com.abdulisik.springbootrestful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class WebController {
	
	@Autowired
	private SubjectsService subjectsService;
	
	@Autowired
	private SubjectsRepository subjectsRepository;
	
	@RequestMapping("/")
	public String index(Model model, Principal principal) {
		return "index";
	}
	
	@RequestMapping("/home")
	public String showSubjects(@ModelAttribute Subject subject, Model model) {
		if (subject != null && subject.getName() != null) {
			subject.setId((int) (subjectsRepository.count() + 1));
			subjectsRepository.save(subject);
		}
		model.addAttribute("allSubjects", subjectsService.findAll());
		model.addAttribute("subjectObject", new Subject());
		return "home";
	}
	
}
