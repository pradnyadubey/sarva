package com.synoptek.app.sarva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.synoptek.app.sarva.dto.AuthenticateDTO;

@Controller
public class AuthController {

	@GetMapping("/")
    public String showLoginPage(Model model) {
		model.addAttribute("authDto", new AuthenticateDTO()); 
        return "/auth/auth";
    }
	
	@PostMapping("/authenticate")
	public ModelAndView authenticate(@ModelAttribute(name = "authDto") AuthenticateDTO authenticateDto,
			ModelMap model) {
		System.out.println("in authenticate");
		if(!StringUtils.hasText(authenticateDto.getEmail()) || authenticateDto.getUsercode().length <= 0) {
			ModelAndView mv = new ModelAndView("/auth/auth"); 
			mv.addObject("errorMsg", "Invalid username or password");
			return mv;
		}else {
			System.out.println(model);
			return new ModelAndView("/home");
		}
	}
}
