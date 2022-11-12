package com.adrian.olvera.di.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {

	//@Pointcut("execution(* com.adrian.olvera.di.aop.TargetObject.*(..))")
	//@Pointcut("within(TargetObject)")
	@Pointcut("annotation(Devs4jAnnotation)")
	public void targetObjectMethod() {
		
	}
}
