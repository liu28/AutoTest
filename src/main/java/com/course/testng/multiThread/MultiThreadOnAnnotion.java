package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 20,threadPoolSize=100)
    public void test()
    {
        System.out.println("xiaoguangliu");
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        //%s%n表示当前位置输出字符串并换行
    }
}
