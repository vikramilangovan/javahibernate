package com.collectionmapping.onetomanybylist;

import java.util.*;  
import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class FetchData {  
public static void main(String[] args) {  
      
    Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
      
    Query query=session.createQuery("from Question");  
    List<Question> list=query.list();  
      
    Iterator<Question> itr=list.iterator();  
    while(itr.hasNext()){  
        Question q=itr.next();  
        System.out.println("Question Name: "+q.getQname());  
          
        //printing answers  
        List<Answer> list2=q.getAnswers();  
        Iterator<Answer> itr2=list2.iterator();  
        int i = 1;
        while(itr2.hasNext()){  
        	
        	Answer a=itr2.next();
            System.out.println(i+"."+a.getAnswername() +" --------- Posted by "+a.getPostedBy());
            i++;
        }  
          
    }  
    session.close();  
    System.out.println("success");  
}  
}  
