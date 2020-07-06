import com.jiang.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
public class test02 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext03.xml");
        Person person = app.getBean("person",Person.class);
        System.out.println(person);
    }
}
