package com.ssafy.step1.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Aspect
@Component
public class PerformanceCheckAspect {
	
	@Pointcut("execution(* com.ssafy.step1.annotation.GreetingService.*(..))")
	public void greetingHelloPointcut() {}
	
	@Around("greetingHelloPointcut()")
//	@Around("execution(* com.ssafy.step1.annotation.GreetingService.*Hello(..))")
	public Object checkTime(ProceedingJoinPoint joinPoint) {
		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		Object obj = null;
		
		try {
			// before
			long start = System.nanoTime();
			System.out.println("---------- " + methodName + "수행 시간 체크 시작 ");
			
			obj = joinPoint.proceed();

			// after returning
			long end = System.nanoTime();
			System.out.println("---------- " + methodName + "수행 시간 체크 완료 " + (end - start) + "ns");
			
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			// after
		}	
		
		return obj;

	}
}
