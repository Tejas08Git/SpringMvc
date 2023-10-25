package com.cjc.springmvccrud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springmvccrud.app.model.Employee;
import com.cjc.springmvccrud.app.servicei.EmployeeServiceI;



@Controller
public class EmployeeController {
	
	
	@Autowired
	EmployeeServiceI esi;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/regg")
	public String preReg()
	{
		return "Register";
	}
	
	
	@RequestMapping("/da")
	public String saveEmployee(@ModelAttribute Employee e)
	{
		
		esi.saveEmployee(e);
		
		
		return "login";
	}
	
	
	@RequestMapping("/get")
	public String getdata(@RequestParam("id") int id,Model m)
	{
		
		
		Employee e=esi.getdata(id);
		m.addAttribute("ee", e);
		
		
		return "success";
		
	}

}
