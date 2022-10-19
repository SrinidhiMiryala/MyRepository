package com.jnit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WiproService {
	
	@Autowired
	private WiproRepository wr;
	
	public List<wipro> select(){
		List<wipro> li=wr.findAll();
		return li;
		
	}
	public void insert(wipro s) {
		wr.save(s);
	}

}
