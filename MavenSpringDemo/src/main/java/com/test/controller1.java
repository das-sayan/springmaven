package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class controller1 {
	
	@RequestMapping(value="/checkaccount", method=RequestMethod.POST)
			 public String display
			 (
			  @RequestParam("fname")
			  String firstname,
			 
			  Model m
			 )

			 {
			 if(firstname.equals("Sayan")){
			  String msg="Hello "+firstname;
			  //add a message to the model
			  m.addAttribute("message",msg);
			  return "successpage";
			 }
			 else
			 {
			  String msg=firstname;
			  //add a message to the model
			  m.addAttribute("message1",msg);
			  return "errorpage"; //view jsp
			 }
	 }
}
