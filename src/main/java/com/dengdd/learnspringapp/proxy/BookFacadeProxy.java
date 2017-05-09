package com.dengdd.learnspringapp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// JDK动态代理类
// JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理，cglib是针对类来实现代理的，
// 他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理。
public class BookFacadeProxy implements InvocationHandler {
	
	private Object target;

	// 绑定一个委托对象，并返回代理类
	public Object bind(Object obj) {
		this.target = obj;
		// 获取代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("事务开始...");
		result = method.invoke(target, args);
		System.out.println("事务结束...");
		return result;
	}

}
