package com.example.CalculatorNumberSpring.CalController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.CalculatorNumberSpring.domain.Calculate;

@Controller
public class CalculatorController {
	
		@GetMapping("/index")
		public String ViewForm(Model model)
		{
			model.addAttribute("Calculate", new Calculate());
			return "index";
		}
		
		@PostMapping("/calculate")
		public String addForm(@ModelAttribute Calculate calculate,BindingResult result,Model model)
		{
			model.addAttribute("calculate",calculate);
			return "calculate";
		}

}
