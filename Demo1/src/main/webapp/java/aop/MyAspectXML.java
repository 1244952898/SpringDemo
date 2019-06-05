package aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {
    public void checkPro() {
        System.out.println("checkPro=======");
    }

    public void Logging(Object result) {
        System.out.println("Logging=======" + result);
    }

    public Object Round(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Round===========1");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("Round===========2");
        return o;
    }

    public void afterThrowing(Throwable ex){
        System.out.println("afterThrowing==========="+ex.getMessage());
    }

    public void after(){
        System.out.println("after===========");
    }
}
