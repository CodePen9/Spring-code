import com.jiang.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ioc2.xml");
        Person person01 = app.getBean("person01", Person.class);

        //测试注释


        System.out.println(person01.getLastName() == null);
    }
}
