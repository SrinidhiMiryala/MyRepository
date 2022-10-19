package com.jnit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WiproController {
	@Autowired
	private WiproService ws;
	
	@RequestMapping(value="/listwipro",method=RequestMethod.GET)
	public List<wipro> getAllEmployess(){
		return ws.select();
	}

}
