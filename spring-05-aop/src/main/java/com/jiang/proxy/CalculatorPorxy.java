package com.jiang.proxy;

import com.jiang.inter.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Title:
 * @author: JiangPeng
 */
public class CalculatorPorxy {

    public static Calculator getProxy(final Calculator calculator){
        /*
           为传入的参数创建一个动态代理对象
           Calculator calculator：传入的被代理对象
           创建代理对象通过JDK的Proxy.newProxyInstance()
         */
        ClassLoader classLoader = calculator.getClass().getClassLoader();//被代理对象的类加载器
        Class<?>[] classes = calculator.getClass().getInterfaces();//被代理对象所实现的所有接口

        InvocationHandler invocationHandler = new InvocationHandler() {
            /*
                Object proxy：代理对象：给JDK使用，我们任何时候不要动这个对象
                Method method：当前将要执行的目标对象的方法。
                Object[] args：这个方法调用时外界传入的参数值
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                //利用反射执行目标方法
                //calculator：执行的代理对象；在这里如果需要在内部类里用一个声明的参数，需要将这个参数设置final
                //result：目标方法执行后的返回值
                System.out.println("【"+method.getName()+"】方法执行开始，该方法的参数值是【"+ Arrays.asList(args)+"】");
                Object result = method.invoke(calculator, args);
                System.out.println("【"+method.getName()+"】方法执行结束了");
                return result;//返回值必须返回出去，外界才能拿到真正执行后的返回值
            }
        };//方法执行器，帮我们目标对象执行目标方法



        //proxy为目标对象创建代理对象
        Object proxy = Proxy.newProxyInstance(classLoader, classes, invocationHandler);
        return (Calculator) proxy;
    }


}
