package com.cjc.springmvccrud.app.daoimpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.springmvccrud.app.daoi.EmployeeDaoI;
import com.cjc.springmvccrud.app.model.Employee;

public class EmployeeDaoImpl implements EmployeeDaoI {

	@Autowired
	SessionFactory sf;
	
	
	
	@Override
	public void saveEmployee(Employee e) {
		
		Session ses=sf.openSession();
		ses.save(e);
		ses.beginTransaction().commit();
		
	}



	@Override
	public Employee getdata(int id) {
		Session ses=sf.openSession();
		Employee e=ses.get(Employee.class,id);
		
		return e;
		
	}
	
	

}
