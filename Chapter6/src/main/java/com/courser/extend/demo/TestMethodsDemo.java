package com.courser.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//idea右键新建选项没有Java class选项
//解决方法：https://blog.csdn.net/qq_28285625/article/details/80844864
public class TestMethodsDemo {
    @Test
    public void test1()
    {
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2()
    {
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3()
    {
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void test4()
    {
        Assert.assertEquals("qw","w");
    }
    @Test
    public void test5()
    {
        Assert.assertEquals("12","13");
    }
    @Test
    public void logDemo()
    {
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }
}

