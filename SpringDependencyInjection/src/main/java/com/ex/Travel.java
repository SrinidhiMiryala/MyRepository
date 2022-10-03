package com.ex;

public class Travel implements Journey {
	Vehicle v;
	
	
	public void setV(Vehicle v) {
		this.v = v;
	}


	public void startJourney() {
		v.move();
	}

}
