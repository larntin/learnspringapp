package com.dengdd.learnspringapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dengdd.learnspringapp.aop.Audience;
import com.dengdd.learnspringapp.aop.Thinker;
import com.dengdd.learnspringapp.beans.Performer;
import com.dengdd.learnspringapp.beans.PoeticJuggler;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:com/dengdd/learnspringapp/aop/myaop.xml")
public class AOPTest {
	
	@Autowired
	private ApplicationContext context;
	
	@Before
	public void setUp() {
		System.out.println("AOPTest Before");
	}
	
	@After
	public void clearDown() {
		System.out.println("AOPTest After");
	}

//	@Test
//	public void test1() {
//		Audience a1 = (Audience) context.getBean("audience1");
//		a1.takeSeat();
//	}
//	
//	@Test
//	public void test2() {
//		//PoeticJuggler p1 = (PoeticJuggler) context.getBean("poeticJuggler1");
//		Performer p1 = (Performer) context.getBean("poeticJuggler1");
//		p1.perform();
//	}
	
	@Test
	public void test3() {
		Thinker t1 = (Thinker) context.getBean("volunteer1");
		t1.thinkOfSomething("hello world!");
	}
}
