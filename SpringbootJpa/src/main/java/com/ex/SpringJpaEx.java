package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaEx {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ca=SpringApplication.run(SpringJpaEx.class, args);
        StudentService se=ca.getBean(StudentService.class);
       /* Student s =new Student();
        s.setMarks(470);
        s.setName("sai");
        se.insert(s);
        */
        se.update();
        se.select();
        //se.delete();
       
        
		
	}

}
