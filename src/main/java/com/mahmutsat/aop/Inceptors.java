package com.mahmutsat.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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

//    @Around("execution(* com.mahmutsat.model.Staff.greeting(..))")
//    public void around(JoinPoint joinPoint){
//        System.out.println("*----- Around -----* : " + joinPoint.getSignature().getName());
//    }
}
