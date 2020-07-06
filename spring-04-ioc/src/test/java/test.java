import com.jiang.service.BookService;
import com.jiang.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = app.getBean("bookService", BookService.class);
        UserService userService = app.getBean("userService", UserService.class);
        bookService.save();
        userService.save();
    }
}
