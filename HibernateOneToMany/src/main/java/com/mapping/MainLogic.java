package com.mapping;

import java.util.HashSet;
import java.util.Set;

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
        Vendor v=new Vendor();
        v.setVid(1001);
        v.setVname("Amazon");
        
        Customer manasa=new Customer();
        manasa.setCid(201);
        manasa.setCname("manasa sharma");
        
        Customer kalle=new Customer();
        kalle.setCid(2001);
        kalle.setCname("kalle sai");
        
        Set hs=new HashSet();
        hs.add(manasa);
        hs.add(kalle);
        
        v.setCust(hs);
        se.save(v);

		tx.commit();
	}
}


	

