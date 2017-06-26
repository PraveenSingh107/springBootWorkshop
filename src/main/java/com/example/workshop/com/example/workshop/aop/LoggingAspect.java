package com.example.workshop.com.example.workshop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.example.workshop.com.example.workshop.aop.TripService.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("INFO :: Before method call : " + joinPoint.getSignature().getName());
        logger.info("INFO :: Before method call args : " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("execution(* com.example.workshop.com.example.workshop.aop.TripService.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("INFO :: After method call : " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* com.example.workshop.com.example.workshop.aop.TripService.*(..))",
            returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        logger.info("INFO :: After method call return value: " + result);
    }

//    @AfterThrowing(value = "execution(* com.example.workshop.com.example.workshop.aop.TripService.*(..))",
//            throwing = "exception")
//    public void afterThrowingMethod(JoinPoint joinPoint, Throwable exception) {
//        logger.error("ERROR :: After method call : " + joinPoint.getSignature().getName());
//        logger.error("ERROR :: return call exception : " + exception.getStackTrace());
//    }
}
