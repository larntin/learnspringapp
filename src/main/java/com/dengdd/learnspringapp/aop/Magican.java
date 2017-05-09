package com.dengdd.learnspringapp.aop;

public class Magican implements MindReader {
	
	private String throught;
	
	public Magican() {
	}

	public void interceptThrought(String thoughts) {
		this.throught = thoughts;
		System.out.println("interceptThrought Throughts:" + thoughts);
	}

	public String getThrought() {
		return throught;
	}
}
