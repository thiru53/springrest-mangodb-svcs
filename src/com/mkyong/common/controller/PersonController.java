package com.mkyong.common.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mkyong.common.services.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Resource(name="personServiceImpl")
	PersonService personService;

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getPerson(@PathVariable String name, ModelMap model) {		
		model.addAttribute("movie", name);
		String a = personService.getPerson();
		System.out.println(a);
		return "list";


	}
	
}