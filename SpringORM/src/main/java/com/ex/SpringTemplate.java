package com.ex;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class SpringTemplate {
 private SessionFactory sf;
 
 
 public void setSf(SessionFactory sf) {
	this.sf = sf;
}

 
 public void select() {
	 Session se=sf.openSession();
	 Query qr=se.createQuery("from Student s");
	 List li=qr.list();
	 Iterator i=li.iterator();
	 while(i.hasNext()) {
		 Student s=(Student)i.next();
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
	 }
	 
 }
 
}