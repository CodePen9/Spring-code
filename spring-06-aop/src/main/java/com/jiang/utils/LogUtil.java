package com.jiang.utils;

        import org.aspectj.lang.JoinPoint;
        import org.aspectj.lang.ProceedingJoinPoint;
        import org.aspectj.lang.Signature;
        import org.aspectj.lang.annotation.*;
        import org.springframework.stereotype.Component;

        import java.util.Arrays;

/**
 * @Title:
 * @author: JiangPeng
 */
@Aspect
@Component
public class LogUtil {
    //想在执行目标之前运行，写入切入点表达式
    //execution(访问权限符 返回值类型 方法签名)
    @Before("execution(public int com.jiang.impl.MyCalculator.add(int,int))")
    public static void logStart(JoinPoint joinPoint){
        //获取到目标方法运行时候的参数
        Object[] args = joinPoint.getArgs();
        //获取到目标方法的签名
        Signature signature = joinPoint.getSignature();
        //从签名中获取方法名
        String name = signature.getName();

        System.out.println("【"+name+"】方法开始前，参数值是【"+Arrays.asList(args)+"】");
    }

    //告诉Spring这个result就是用来接受返回值的：returning = "result"
    @AfterReturning(value = "execution(public int com.jiang.impl.MyCalculator.*(..))",returning = "result")
    public static void logReturn(JoinPoint joinPoint,Object result){

        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法正常执行完成，计算结果是"+result);
    }

    @AfterThrowing(value = "execution(public int com.jiang.impl.MyCalculator.*(..))",throwing = "e")
    public static void logExc(JoinPoint joinPoint,Exception e){

        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法出现异常，异常是"+e);
    }

    @Around("execution(public int com.jiang.impl.MyCalculator.*(..))")
    public static Object myAround(ProceedingJoinPoint pjp) throws Throwable {
    /*
        环绕通知下有一个参数：ProceedingJoinPoint pjp，这个方法很强大。

     */
        //获取方法参数
        Object[] args = pjp.getArgs();
        String name = pjp.getSignature().getName();

        Object proceed = null;
        try{
            //就是利用反射调用目标方法即可 它就是method.invoke
            System.out.println("在proceed前就是前置通知 @Before");
            System.out.println("【环绕前置】【"+name+"方法开始】");
            pjp.proceed(args);
            System.out.println("在proceed后就是 @AfterReturning");
            System.out.println("【环绕返回】【"+name+"方法返回，返回值】"+proceed);
        }catch (Exception e){
            System.out.println("这就是异常通知 @AfterThrowing");
            System.out.println("【环绕异常】【"+name+"方法返回，异常】"+e);
            throw new Exception(e);//为了让外面接收到异常，一定要抛出去
        }finally {
            System.out.println("结束通知 @After");
            System.out.println("【环绕后置】【"+name+"方法结束】");
        }

        System.out.println("环绕。。。");

        //反射调用后一定要返回出去
        return proceed;
    }

}
