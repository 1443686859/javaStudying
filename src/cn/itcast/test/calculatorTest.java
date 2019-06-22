package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {
    @Test
    public void testAdd(){
        Calculator c=new Calculator();
        int result=c.add(3,1);
        // 断言

    Assert.assertEquals(4,result);
    }
}
