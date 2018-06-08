import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest02 {

    @Test
    //测试 add() 方法
    public void testAdd(){
        Calculator c = new Calculator();
        int result1 = c.add(1,2);
        Assert.assertEquals(result1, 3);
    }

    @Ignore //被忽略的测试方法：加上之后，暂时不运行此段代码
    @Test
    //测试 sub() 方法
    public void testSub(){
        Calculator c = new Calculator();
        int result2 = c.sub(3, 1);
        Assert.assertEquals(result2, 2);



    }
}
