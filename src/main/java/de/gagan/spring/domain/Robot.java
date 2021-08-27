package de.gagan.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Robot {
	
	private int id;
	
	private String speech;

	public void speak()
	{
		System.out.println("Id :" + id + " Speech : " + speech);
	}
	
	public int getId() {
		return id;
	}
	
	@Autowired
	public void setId(@Value("${username}")int id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}
	
	@Autowired
	public void setSpeech(@Value("${password}")String speech) {
		this.speech = speech;
	}
	
	

}
