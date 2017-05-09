package com.dengdd.learnspringapp.beans;

public class PoeticJuggler extends Juggler {
	
	private Poem poem;
	
	public PoeticJuggler() {
	}
	
	public PoeticJuggler(Poem p) {
		this.poem = p;
	}
	
	public PoeticJuggler(int beanBags, Poem p) {
		super(beanBags);
		this.poem = p;
	}
	
	public void perform() {
		super.perform();
		System.out.println("PoeticJuggler: ");
		poem.recite();
	}
}
