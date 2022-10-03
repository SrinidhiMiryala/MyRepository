package com.ex;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student amulya=context.getBean(Student.class);
				System.out.println(amulya.getSid()+" "+amulya.getSname()+" "+amulya.getMarks()+" "+amulya.getBranch());
				/*Set s=amulya.getCourse();
				Iterator i=s.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}*/
				
				

	}

}
