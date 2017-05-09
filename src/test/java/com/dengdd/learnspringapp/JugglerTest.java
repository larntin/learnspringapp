package com.dengdd.learnspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dengdd.learnspringapp.beans.Performer;

public class JugglerTest {
	public static void main(String[] args)  {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dengdd/learnspringapp/beans/mybeans.xml");
		Performer p = (Performer)context.getBean("myjuggler");
		p.perform();
		
		Performer p1 = (Performer)context.getBean("poeticJuggler1");
		p1.perform();
	}
}
