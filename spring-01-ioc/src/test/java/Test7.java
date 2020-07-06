import com.jiang.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ioc3.xml");
        Person person02 = app.getBean("person02", Person.class);
        System.out.println(person02);
    }
}
