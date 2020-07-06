import com.jiang.bean.Person;
import com.jiang.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @author: JiangPeng
 */
public class test {
    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        //Person person = app.getBean("person", Person.class);
        //System.out.println(person);

       ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = app.getBean("person");
        System.out.println(person);

    }
}
