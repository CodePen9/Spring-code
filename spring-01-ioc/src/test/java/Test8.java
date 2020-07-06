import com.jiang.bean.AirPlan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ioc3.xml");
        AirPlan airPlan01 = app.getBean("airPlan01", AirPlan.class);
        System.out.println(airPlan01);
        AirPlan airPlan02 = app.getBean("airPlan02", AirPlan.class);
        System.out.println(airPlan02);
        Object myFactoryBeanImpl = app.getBean("myFactoryBeanImpl");
        System.out.println(myFactoryBeanImpl);
    }
}
