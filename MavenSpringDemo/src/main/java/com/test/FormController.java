package com.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainlogin")
public class FormController {

	@RequestMapping("/callpage")
	public String disp(Model model)
	{
		FormBean res = new FormBean();
		Map<String,String> c1 = new HashMap<String,String>();
		
		c1.put("India", "India");
		c1.put("BG", "Bangladesh");
		c1.put("FR", "France");
		c1.put("MSY", "Malaysia");
		//select option values to sending jsp
		model.addAttribute("countries",c1);
		model.addAttribute("result",res);
		return "FormLogin";
	}
		//@ModelAttibute-sending Bean form values to JSP
		@RequestMapping("/valid") 
		public String submitForm(
				@ModelAttribute("result12") FormBean res)
		{
			return "successform";
		}
		
	}

