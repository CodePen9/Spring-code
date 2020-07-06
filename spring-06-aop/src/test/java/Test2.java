import com.jiang.impl.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @author: JiangPeng
 */
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
            切入点表达式
            固定格式：execution(访问权限符 返回值类型 方法全签名(参数表))

            通配符
                *：匹配一个或者多个字符 execution(public int com.jiang.impl.*(int,int))

                   匹配任意一个参数 假设我的add(int,int) 有重载方法add(int,double)那么我此时的就无法进行切入
                   因为我们的表达式的参数值是int,int，所以此时就需要execution(public int com.jiang.impl.*(int,*))

                   权限位置*不能表示任意，不写表示任意：execution(* com..impl.*(..))

                ..：匹配所有参数的方法 execution(public int com.jiang.impl.*(..))
                    匹配任意多层路径 execution(public int com..impl.*(..)) com包下任何多层路径的impl包

            最模糊：execution(* *.*(..)) 任意权限下 任意返回值 任意包任意类任意方法下任意参数
            最精确的：execution(public int com.jiang.impl.MyCalculator.add(int,int))


            &&与：切入的位置要满足这两个表达式
                 execution(public int com..impl.*(..))&& execution(* com.jiang.impl.*(int,int))
                 add(int,double)满足第一个，不满足第二个，所以不行

            ||或：切入的位置满足一个即可
            ！：只要不是这种的都切


         */
        /*
            JoinPoint获取目标的详细信息：
            我们可以在通知方法运行的时候，拿到目标方法的详细信息；
            1.只需要为通知方法的参数列表上写一个参数JoinPoint：封装了当前目标方法的详细信息

         */

        MyCalculator bean = app.getBean(MyCalculator.class);
        bean.add(1,1);


        /*
        Around:环绕，Spring中最强大的通知，
               四合一通知就是环绕通知




         */


    }
}
