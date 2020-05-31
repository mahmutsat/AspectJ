package com.mahmutsat.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Inceptors {
    @Before("execution(* com.mahmutsat.model.Staff.greeting(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("\u001b[35m **** Before **** : " + joinPoint.getSignature().getName() + "\u001b[0m");
    }

    @After("execution(* com.mahmutsat.model.Staff.greeting(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("\u001b[33m *----- After -----* : " + joinPoint.getSignature().getName() + "\u001b[0m");
    }

    @AfterReturning("execution(* com.mahmutsat.model.Staff.greeting(..))")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("\u001b[32m *----- After Returning -----* : " + joinPoint.getSignature().getName() + "\u001b[0m");
    }

    @Around("execution(* com.mahmutsat.model.Staff.greeting(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("\u001b[31m *----- Around (Before) -----* \u001b[0m");
        joinPoint.proceed();
        System.out.println("\u001b[31m *----- Around (After) -----* \u001b[0m");
    }
}
