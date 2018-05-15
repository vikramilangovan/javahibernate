package org.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class FetchData {
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		AnnotationConfiguration cfg=new AnnotationConfiguration();  
		Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession(); 
		Transaction tx = session.beginTransaction();
		List<Object> empList = session.createQuery("from Employee").list();
		for(Object emp : empList){
			Employee e=(Employee) emp;
			System.out.println("List of Employees::"+e.getId()+" "+e.getName());
			}
		session.close();
		}
	}
