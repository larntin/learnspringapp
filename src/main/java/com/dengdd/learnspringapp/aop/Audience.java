package com.dengdd.learnspringapp.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public Audience() {

	}

	public void takeSeat() {
		System.out.println("The Audience is taking there seats.");
	}

	public void turnOffCellPhones() {
		System.out.println("The Audience is turning off there cell phones.");
	}

	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}

	public void watchPerformce(ProceedingJoinPoint joinPoint) {
		try {
			long start = System.currentTimeMillis();
			System.out.println("watchPerformce: Start");
			joinPoint.proceed();
			System.out.println("watchPerformce: End");
			long end = System.currentTimeMillis();
			System.out.println("Took time: " + (end - start));
		} catch (Throwable t) {
			System.out.println("[error]: watchPerformce error");
		}
	}
}
