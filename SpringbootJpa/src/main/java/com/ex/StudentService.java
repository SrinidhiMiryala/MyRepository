package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentRepository sr;
	
	public void insert(Student s) {
		sr.save(s);
		
	}
    public void select() {
    	List li=sr.findAll();
    	Iterator i=li.iterator();
    	while(i.hasNext()) {
    		Student s=(Student)i.next();
    		System.out.println(s.getId()+" "+s.getMarks()+" "+s.getName());
    		
    	}
    	
    }
    public void delete() {
    	Student s=new Student();
    	s.setId(7);
    	sr.delete(s);
    }
    public void update() {
    	sr.updateMarks(200, 101);
    }
    
}
