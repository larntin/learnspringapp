package com.dengdd.learnspringapp.annotationaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	public Audience() {
	}
	
	//定义了一个可以在@Aspect内重用的切点
	//该类除了添加一些注解和一个任何操作的performance()之外还是一个POJO（plain old java object），可以被bean使用
	@Pointcut("execute(* com.dengdd.learnspringapp.annotationaop.Performer.perform(..))")
	public void performance() {
		
	}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("[Audience@takeSeats]: Take seats!");
	}
	
	@After("performance()")
	public void turnOffCellphone() {
		System.out.println("[Audience@turnOffCellphone]: Turn Off Cell phone!");
	}
	
	@AfterReturning("performance()")
	public void applaud() {
		System.out.println("[Audience@applaud]: CLAP CLAP CLAP CLAP CLAP!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("[Audience@demandRefund]: We want monye back!");
	}
}
