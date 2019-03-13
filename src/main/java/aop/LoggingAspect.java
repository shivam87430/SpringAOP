package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    //Question 4
    //Example of PointcutMethods

    @Pointcut("execution(* *())")
    void pointcutMethods() { }
    @Before("aop.LoggingAspect.pointcutMethods()")
    void question4(){
        System.out.println("This is question4");
    }
    //Question 5
    //Example of Before And After Connect
    @Before("execution(void connect())")
    void beforeConnect() {
        System.out.println("Before Connect");
    }

    @After("execution(void connect())")
    void afterConnect() {
        System.out.println("after Connect");
    }


    //Question 6
    //Example of @AfterThrowing Exception
    @AfterThrowing(pointcut = "execution(* *())", throwing = "ex")
    void afterThrowingAdvice(Exception ex) {
        System.out.println("Running AfterThrowing :" + ex);
    }


    //Question 7
    //Example of pointcut Types
    @Pointcut("within(Database)")
    void pointCutWithin() { }

    @Pointcut("bean(database)")
    void pointCutBean() { }


    @Before("execution(void checkPointcutTypes())")
    void executionType() {
        System.out.println("Before---> This is Example of Execution type of PointCut");
    }

    @After("execution(void checkPointcutTypes())")
    void executionType1() {
        System.out.println("After---> This is Example of Execution type of PointCut");
    }

    @Before("pointCutWithin()")
    void withInType() {
        System.out.println("This is Before With In type");
    }

    @After("pointCutWithin()")
    void withInType1() {
        System.out.println("This is After With In type");
    }

    @Before("pointCutBean()")
    void beanType() {
        System.out.println("This is Before Bean type");
    }

    @After("pointCutBean()")
    void beanType1() {
        System.out.println("This is After Bean type");
    }

    @Before("args(Integer)")
    void argsPointType(JoinPoint joinPoint){
        System.out.println("LOG Before is :"+joinPoint.getArgs());
    }

    @After("args(Integer)")
    void argsPointType1(JoinPoint joinPoint){
        System.out.println("LOG After is :"+joinPoint.getArgs());
    }


    @Before("this(Database)")
    void thisPointType(){
        System.out.println("This is Example of this");
    }



    //Question 9
    @Before("execution(void agsMethod1(Integer,Integer))")
    void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Running Before");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
        Object[] object=joinPoint.getArgs();
        for(Object o: object){
            System.out.println(o);
        }
    }

}
