package com.adrian.olvera.di.aop;

import java.lang.module.ModuleDescriptor.Exports.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyAspect {
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	//@Before("execution(* com.adrian.olvera.di.aop.TargetObject.hello(..))")
	@Before("PointcutExample.targetObjectMethod()")
	public void before(JoinPoint joinPoint) {
		log.info("Method name {} ", joinPoint.getSignature().getName());
		log.info("Object Type {} ", joinPoint.getSignature().getDeclaringTypeName());
		log.info("Modifiers {} ", joinPoint.getSignature().getModifiers());
		log.info("Is public {} ", java.lang.reflect.Modifier.isPublic(joinPoint.getSignature().getModifiers()));
		log.info("Arguments {} ", joinPoint.getArgs());
		log.info("Before advice");
	}
	

	
	
}
