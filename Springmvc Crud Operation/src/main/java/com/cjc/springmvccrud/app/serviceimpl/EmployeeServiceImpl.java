package com.cjc.springmvccrud.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.springmvccrud.app.daoi.EmployeeDaoI;
import com.cjc.springmvccrud.app.model.Employee;
import com.cjc.springmvccrud.app.servicei.EmployeeServiceI;


public class EmployeeServiceImpl implements EmployeeServiceI{
	
	@Autowired
	EmployeeDaoI edi;
	@Override
	public void saveEmployee(Employee e) {
		
		edi.saveEmployee(e);
		
		
	}
	@Override
	public Employee getdata(int id) {
		Employee ee=edi.getdata(id);
		return ee;
	}

}
