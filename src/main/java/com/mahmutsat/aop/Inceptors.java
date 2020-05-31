package com.mahmutsat.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Inceptors {
    @Before("execution(* com.mahmutsat.model.Staff.greeting(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("**** Before **** : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.mahmutsat.model.Staff.greeting(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("*----- After -----* : " + joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* com.mahmutsat.model.Staff.greeting(..))")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("*----- After Returning -----* : " + joinPoint.getSignature().getName());
    }

    @Around("execution(* com.mahmutsat.model.Staff.greeting(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("*----- Around (Before) -----* ");
        joinPoint.proceed();
        System.out.println("*----- Around (After) -----* ");
    }
}
