import com.jiang.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ioc.xml");
        Person person05 = app.getBean("person05", Person.class);

        System.out.println(person05);
    }
}
