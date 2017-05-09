package com.dengdd.learnspringapp.proxy;

public class BookFacadeImpl implements BookFacade {
	@Override
	public void addBook() {
		System.out.println("[BookFacadeImpl@addBook]:hello!");
	}
}
