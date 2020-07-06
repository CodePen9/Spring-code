import com.jiang.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        /*
        通过构造器的方式
         */

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
        Person person03 = ioc.getBean("person03", Person.class);
        System.out.println("容器创建完毕");
        System.out.println(person03);
        /*
        Q:通过构造器创建有什么不同?
        1.我们之前通过property的name >> 然后通过set方法进行赋值,通过无参构造进行创建对象
        2.我们现在是通过的有参构造器进行对Bean赋值,不通过无参，也不通过set/get进行赋值
        PS：你的有参构造有几个参数,你的constructor-arg 就需要写几个 否则报错

        Q:通过有参构造不写name 只写value赋值
        


         */
    }
}
