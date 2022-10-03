package com.one;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
        SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        Student arohi=new Student();
        arohi.setSid(101);
        arohi.setSname("arohi");
        arohi.setMarks(90);
        
        
        Address a=new Address();
        a.setAid(201);
        a.setPlace("Hyderabad");
        a.setObj(arohi);
        
        
        
        se.save(a);

		tx.commit();
	}
}


	

