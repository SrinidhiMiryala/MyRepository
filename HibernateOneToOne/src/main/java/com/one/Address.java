package com.one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")

public class Address {
	@Id
	@JoinColumn(name="aid")
	private int aid;
	@JoinColumn(name="place")
	private String place;
	@OneToOne(targetEntity=Student.class,cascade=CascadeType.ALL)
	@JoinColumn(name="stid",referencedColumnName="sid")
	private Student obj;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Student getObj() {
		return obj;
	}

	public void setObj(Student obj) {
		this.obj = obj;
	}

	
	
	

}
