import com.jiang.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        /*
            Q:根据bean的类型从IOC容器中获取bean的实例
            A:我们通过getBean(),传入的参数不是之前的property里的name值,而是直接传入的类的类型.
            那么最终还是成功获取到了结果

            Q:加入说我Xml中如果有2个注册的组件(类),都是一个类型,会怎么样？
                (此时我们在xml中注册了第二个bean：person02)
            A:报NoUniqueBeanDefinitionException:没有输入唯一的bean定义
            No qualifying bean of type 'com.jiang.bean.Person' available:
            所以 如果ioc容器中如果这个类型的bean有多个,那么则会失败

            Q：第三种写法 getBean("xml中的name",xml中class对应的类型.class)
            a: getBean("person01",Person.class); 不需要强转
        */



        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
        Person bean = ioc.getBean(Person.class);
        System.out.println(bean);


    }
}
