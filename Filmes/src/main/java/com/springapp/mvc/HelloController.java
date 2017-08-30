package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/init")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "hello";
	}
}