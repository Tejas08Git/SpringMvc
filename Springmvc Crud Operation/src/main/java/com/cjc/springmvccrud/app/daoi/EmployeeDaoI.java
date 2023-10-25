package com.cjc.springmvccrud.app.daoi;

import com.cjc.springmvccrud.app.model.Employee;

public interface EmployeeDaoI {
public void saveEmployee(Employee e);
public Employee getdata(int id);
}
