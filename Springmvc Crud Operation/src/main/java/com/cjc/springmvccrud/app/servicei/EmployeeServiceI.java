package com.cjc.springmvccrud.app.servicei;

import com.cjc.springmvccrud.app.model.Employee;

public interface EmployeeServiceI {

	public void saveEmployee(Employee e);
	public Employee getdata(int id);
}
