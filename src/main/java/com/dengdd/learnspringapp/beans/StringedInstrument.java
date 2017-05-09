package com.dengdd.learnspringapp.beans;

import java.lang.annotation.*;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface StringedInstrument {
	//注解的interface前面必须带有@符号	
}
