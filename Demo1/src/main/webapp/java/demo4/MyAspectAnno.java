package demo4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectAnno {
    @Pointcut(value = "execution(* demo4.OrderDao.add(..))")
    private void BeforPointCut(){}
    @Pointcut(value = "execution(* demo4.OrderDao.del(..))")
    private void AfterReturningPointCut(){}
    @Pointcut(value = "execution(* demo4.OrderDao.upd(..))")
    private void AroundPointCut(){}
    @Pointcut(value = "execution(* demo4.OrderDao.sel(..))")
    private void AfterThrowingPointCut(){}
    @Pointcut(value = "execution(* demo4.OrderDao.sel(..))")
    private void AfterPointCut(){}

    @Before(value = "MyAspectAnno.BeforPointCut()")
    public void before(){
        System.out.println("before===========");
    }

    @AfterReturning(pointcut ="MyAspectAnno.BeforPointCut()" ,returning = "reslt")
    public void afterreturn(Object reslt){
        System.out.println("afterreturn==========="+reslt+"===");
    }

    @Around(value = "MyAspectAnno.AroundPointCut()")
    public Object round(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("rount========1");
        Object o= proceedingJoinPoint.proceed();
        System.out.println("rount========2");
        return o;
    }

    @AfterThrowing(value = "MyAspectAnno.AfterThrowingPointCut()",throwing = "ex")
    public void Throw(Throwable ex){
        System.out.println("AfterThrowing========"+ex.getMessage());
    }

    @After(value = "MyAspectAnno.AfterPointCut()")
    public void After(){
        System.out.println("After========");
    }
}
