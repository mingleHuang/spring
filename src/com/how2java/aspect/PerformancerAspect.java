package com.how2java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class PerformancerAspect {
	@Around(value = "execution(* com.how2java.service.ProductService.*(..))")
	public Object performance(ProceedingJoinPoint joinPoint) throws Throwable{
        Object object = joinPoint.proceed();
        System.out.println("end proformance check:" + joinPoint.getSignature().getName());
        return object;
	}

}
