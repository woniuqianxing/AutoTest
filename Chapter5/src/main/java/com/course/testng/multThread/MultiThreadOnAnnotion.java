package com.course.testng.multThread;

/**
 * 此包为多线程测试-注解方法实现
 */

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    //invocationCount = 10表示10个线程,threadPoolSize线程池设置
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());//把我的线程ID打印出来
    }
}
