package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Employee;

public class Test {
	 public static void main(String[] args)
	    {
	        Configuration configuration=new Configuration();
	        configuration.configure();

	        SessionFactory sessionFactory=configuration.buildSessionFactory();
	        Session session=sessionFactory.openSession();
	        Employee employee=(Employee)session.get("com.hibernate.entities.Employee",111);
	        if(employee==null)
	            System.out.println("Employeee Doesnot Exist");
	        else {
	            System.out.println("Employee Details");
	            System.out.println("-----------------------------");
	            System.out.println("Employee No :"+employee.getEno());
	            System.out.println("Employee No :"+employee.getEname());
	            System.out.println("Employee No :"+employee.getEsal());
	            System.out.println("Employee No :"+employee.getEaddr());
	        }



	    }

}
