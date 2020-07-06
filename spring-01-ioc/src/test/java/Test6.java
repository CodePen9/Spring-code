import com.jiang.bean.Book;
import com.jiang.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ioc2.xml");
        Person person02 = app.getBean("person02", Person.class);
        List<Book> books = person02.getBooks();
        System.out.println(books);
        System.out.println("============");
        Map<String, Object> maps = person02.getMaps();
        System.out.println(maps);
        System.out.println(person02.getProperties());
    }
}
