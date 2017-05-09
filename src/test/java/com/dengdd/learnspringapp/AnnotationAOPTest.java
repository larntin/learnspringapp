package com.dengdd.learnspringapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dengdd.learnspringapp.annotationaop.Audience;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:com/dengdd/learnspringapp/annotationaop/myannotationaop.xml")
public class AnnotationAOPTest {

	@Autowired
	private ApplicationContext ctx;
	
	@Test
	public void test1 () {
		Audience a1 = (Audience)ctx.getBean("a1");
	}
}
