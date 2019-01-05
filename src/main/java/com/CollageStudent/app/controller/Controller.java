package com.CollageStudent.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CollageStudent.app.model.Student;

@RestController
public class Controller {

	@RequestMapping(value="/", method=RequestMethod.GET)

	public Student getValue()
	{
		Student student = new Student();
		student.setName("Deepak");
		return student;


	}	

}
