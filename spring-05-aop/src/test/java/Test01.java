import com.jiang.impl.MyCalculator;
import com.jiang.inter.Calculator;
import com.jiang.proxy.CalculatorPorxy;

/**
 * @Title:
 * @author: JiangPeng
 * @Code: No Bug
 */
public class Test01 {
    public static void main(String[] args) {
        Calculator calculator = new MyCalculator();
        //calculator.add(1,2);

        Calculator proxy = CalculatorPorxy.getProxy(calculator);
        proxy.add(1,2);


    }

}
