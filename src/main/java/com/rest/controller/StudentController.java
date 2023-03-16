package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Student;
import com.rest.service.StudentServiceImp;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentServiceImp service;
	@PostMapping("/save")
	public String save(@RequestBody Student std,Model m)
	{	Student s=service.insert(std);
	    String mes=null;
		if(s!=null)
		{
			mes="data is saved successfully";
		}
		else
		{
			mes="data is inserting is failed";
		}
		return mes;
		
	}
	@DeleteMapping("/delete/{stdId}")
	public void deleteStudent(@PathVariable Integer stdId)
	{
		service.delete(stdId);
	}
	@GetMapping("/getOne/{stdId}")
	public Student getStudent(@PathVariable Integer stdId)
	{
		Student std1=service.getOne(stdId);
		return std1;
	}
	@PutMapping("/update")
	public Student getAllStudent(@RequestBody Student std)
	{
		Student std2=service.update(std);
		return std2;
		
	}
	@GetMapping("/getAll")
	public List<Student> getAll()
	{
		List<Student> ls=service.getAll();
		return ls;
	}

}
