package com.inheritancemapping.tableperConcrete;

import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class StoreData {  
public static void main(String[] args) {  
AnnotationConfiguration cfg=new AnnotationConfiguration();  
Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
      
    Transaction t=session.beginTransaction();  
      
    Employee e1=new Employee();  
    e1.setName("sonoo");  
      
    Regular_Employee e2=new Regular_Employee();  
    e2.setName("Vivek Kumar");  
    e2.setSalary(50000);  
    e2.setBonus(5);  
      
    Contract_Employee e3=new Contract_Employee();  
    e3.setName("Arjun Kumar");  
    e3.setpayperhour(1000);  
    e3.setcontractduration("15 hours");  
      
    session.persist(e1);  
    session.persist(e2);  
    session.persist(e3);  
      
    t.commit();  
    session.close();  
    System.out.println("success");  
}  
}  