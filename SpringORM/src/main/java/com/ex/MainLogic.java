package com.ex;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainLogic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	    SpringTemplate st=(SpringTemplate)context.getBean("getSpringTemplate");
	    st.select();
				

	}

}