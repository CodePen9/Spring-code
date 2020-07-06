import com.jiang.impl.MyCalculator;
import com.jiang.inter.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @author: JiangPeng
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Calculator bean = app.getBean(Calculator.class);
        //bean.add(1,2);
        //System.out.println(bean);
        //System.out.println(bean.getClass());
        /*
            AOP的细节：
            打印bean是com.jiang.impl.MyCalculator@1bb5a082，看起来bean是MyCalculator类型的，
            但实际上当你打印bean.getClassclass com.sun.proxy.$Proxy15
            发现但实际类型是代理对象
            1.Aop的底层就是动态代理，容器中保存的组件是他的代理对象，
            所以如果从容器拿对象，通过类型拿需要写接口类型而不是本类，或者你通过id获取。

         */
        /*
            2.即使没有接口，也可以创建对象，获取的时候就是本类
            com.jiang.impl.MyCalculator@740773a3
            class com.jiang.impl.MyCalculator$$EnhancerBySpringCGLIB$$44159919
            还是一个代理对象，知识CGLIB帮我们创建好的对象

         */
        MyCalculator bean = app.getBean(MyCalculator.class);
        System.out.println(bean);
        System.out.println(bean.getClass());


    }
}
