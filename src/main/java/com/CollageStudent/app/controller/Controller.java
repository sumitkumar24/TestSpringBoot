package com.CollageStudent.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(value="/", method=RequestMethod.GET)

	public String getValue()
	{
		return "Ok Google";


	}	

}
