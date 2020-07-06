import com.jiang.impl.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @author: JiangPeng
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyCalculator bean = app.getBean(MyCalculator.class);
        bean.add(1,2);
    }
}
