package com.dengdd.learnspringapp.proxy;

public class BookfacadeImplCGLib implements BookfacadeCGLib {

	@Override
	public void addBook(String name) {
		System.out.println("[BookfacadeImplCGLib@addBook]:" + name);
	}

}
