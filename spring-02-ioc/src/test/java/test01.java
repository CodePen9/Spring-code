import com.jiang.bean.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class test01 {
    public static void main(String[] args) throws SQLException {
        /**
         * 单实例：bean的生命周期
         *         (容器启动)构造器---->初始化方法---->(容器关闭)销毁方法
         * 多实例:
         *        (获取bean)构造器---->构造方法---->(容器关闭)不会调用bean的销毁方法
         * 后置处理器：
         *        (容器启动)构造器--= 后置处理器before... =-->初始化方法--= 后置处理器after... =-->bean初始化完成--->(容器关闭)销毁方法
         * 无论bean有没有初始化方法，后置处理器都会默认其有初始化方法，
         **/
      //  ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");


        ApplicationContext app02 = new ClassPathXmlApplicationContext("applicationContext02.xml");
        DataSource comboPooledDataSource = app02.getBean("comboPooledDataSource", DataSource.class);
        System.out.println(comboPooledDataSource.getConnection());

        Object bookTest = app02.getBean("BookTest");
        System.out.println(bookTest);

    }
}
