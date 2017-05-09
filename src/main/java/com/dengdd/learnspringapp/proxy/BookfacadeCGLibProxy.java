package com.dengdd.learnspringapp.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import net.sf.cglib.proxy.Enhancer;

// 使用cglib动态代理 
//JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理，cglib是针对类来实现代理的，
//他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理。
public class BookfacadeCGLibProxy implements MethodInterceptor {
	
	private Object target;
	
	public Object getInstance(Object obj) {
		this.target = obj;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		//设置回调
		// enhancer.setCallback();
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("事物开始");  
		arg3.invokeSuper(arg0, arg2);  
        System.out.println("事物结束");  
		return null;
	}

}
