package test.sample;

import org.junit.Test;
import org.testng.Assert;

public class TestDemo {

    @Test
    public void testcase1(){
        Assert.assertTrue(false);
        System.out.println("testcasel");
    }

    @Test
    public void testcase2(){
        Assert.assertTrue(true);
        System.out.println("testcase2");
    }

}
