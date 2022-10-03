package com.ex;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Category bc=context.getBean(Category.class);
		System.out.println("Category name:"+bc.getName());
		bc.show();
		
				

	}

}
