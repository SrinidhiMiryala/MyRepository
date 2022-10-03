package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot {
	public static void main(String args[]) {
		ConfigurableApplicationContext ca=SpringApplication.run(SpringBoot.class,args);
		StudentDao sd=ca.getBean(StudentDao.class);
		sd.select();
		
	}

}
