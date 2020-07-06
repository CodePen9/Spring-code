import com.jiang.bean.Person;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        /*
            ApplicationContext:代表ioc容器
            ClassPathXmlApplicationContext:ioc容器的配置文件在类路径下
            FileSystemXmlApplicationContext:在磁盘下的配置文件
         */

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
        Person person01 = (Person) ioc.getBean("person01");
        System.out.println(person01);
        /*
            小细节：
            1.ApplicationContext其实就是IOC容器的接口
            2.Q：给容器注册一个组件(类),该对象是什么时候创建好的呢？
            Answer：
            我们可以在对象的无参构造上 写一个println
            demo:
                public class Person(){
                    System.out.println("对象开始创建");
                 }

            PS：当我们创建这个对象的时候 会执行这个无参构造，然后就会println
            此时我们就知道什么时候创建的对象了

            于是我们可以看到 当创建好ioc容器，并读取 configLocation(.xml文件)时,println
            所以对象的创建是在容器启动之后开始创建完毕的,不是getBean的时候创建的
            假如你的xml中注册了2个对象，那么则容器创建完成后，先把这2个对象创建完毕

            3.如果同时getBean 2次同一个对象，那么他们是相同的吗？
            A：相同，同一个组件在ioc容器中是单实例的，容器启动完就创建好的
            PS：但有一个@Scope注解,没加之前,默认的bean是单实例的，
                加入@Scope(“prototype”),变成多实例,后面有不作过多赘述

            4.如果getBean一个不存在的组件,会怎么样？
            报NoSuchBeanDefinitionException: No bean named '这是你getbean的名字' available

            5.property怎么进行赋值的
            ioc容器在创建这个组件对象的时候 (property)会利用setter方法对javaBean的属性进行赋值

            6.JavaBean(对象)的属性名是由什么决定的?
            即我们在XML文件中的 name指定对应的class文件里的属性名由谁决定的?
            -- 不是由你声明好的String lastName决定，而是由你的get/set方法决定
            你set方法中setXXX,这XXX就是所决定你name对应的属性名
            即使你是String useName,但假设我把setuserName改成setmyName,
            那么你的property中的name 就需要写myName而不是userName
            Ps: 当然如果你是用lombok插件或者idea快捷键生成的set/get方法那么就不需要考虑这个问题,
            除非你自己手打的才可能会出现这个错误 =.=

         */

    }
}
