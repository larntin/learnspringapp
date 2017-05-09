package com.dengdd.learnspringapp.beans;

public class Juggler implements Performer {
	private int beanBags = 0;

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public void perform() {
		System.out.println("Juggler " + this.beanBags + " BeanBags");
	}
}
