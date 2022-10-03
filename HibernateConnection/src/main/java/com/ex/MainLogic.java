package com.ex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");

		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();

		//Transaction tx=se.beginTransaction();

		NativeQuery nr=se.createSQLQuery("select * from wipro where eid in(?,?) ");
		nr.setParameter(1,10);
		nr.setParameter(2,103);
		
		List li=nr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
		Object[] w=(Object[])i.next();
		System.out.println(w[0]+" "+w[1]+" "+w[2]+" "+w[3]);
			//System.out.println(w.getEid()+" "+w.getName()+" "+w.getSalary()+" "+w.getBranch());
		}

		//tx.commit();


	}

}
