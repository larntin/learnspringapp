package com.dengdd.learnspringapp.aop;

public class Volunteer implements Thinker {
	
	private String throught;
	
	public Volunteer() {
	}
	
	public void thinkOfSomething(String throughts) {
		this.throught = throughts;
	}
	
	public String getThroughts() {
		return this.throught;
	}
}
