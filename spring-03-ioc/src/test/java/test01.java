import com.jiang.servlet.BookServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
public class test01 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext02.xml");
        BookServlet bean = app.getBean("bookServlet",BookServlet.class);
        bean.saveBook();
    }
}
