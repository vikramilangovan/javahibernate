package com.hb.hbclass;

import org.hibernate.Session;  
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;  

public class StoreData {  
public static void main(String[] args) {  
      
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();  
	      
	    Transaction t=session.beginTransaction();  
	      
	    Employee e1=new Employee();  
	   // e1.setId(1001);  
	    e1.setFirstName("sonoo");  
	    e1.setLastName("jaiswal");  
	      
//	    Employee e2=new Employee();  
//	   // e2.setId(1002);  
//	    e2.setFirstName("vimal");  
//	    e2.setLastName("jaiswal");  
      
	    session.persist(e1);  
//	    session.persist(e2);  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("successfully saved");    
      
}  
}  
