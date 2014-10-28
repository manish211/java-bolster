package com.cango.java.concurrent;

/**
 * Created by caoyanfei079 on 8/29/14.
 */
public class TestCase2_1 {
    public static void main(String[] argu) {
        System.out.println("Start test");
        System.out.println("--------------------------------");
        System.out.println("测试两个线程 同时执行不同对象的 Synchronized public void printCount()方法");
        System.out.println("期望相关的信息在不同的线程中执行");
        final TestService testCase1 = new TestService();
        final TestService testCase2 = new TestService();
        Thread t1 = new Thread(new ThreadWithTest(new ThreadWithTest.CallBack(){
            public void callback() {
                testCase1.printCountWithSynchronized();
            }
        }));
        Thread t2 = new Thread(new ThreadWithTest(new ThreadWithTest.CallBack(){
            public void callback() {
                testCase2.printCountWithSynchronized();
            }
        }));
        t1.start();
        t2.start();
        System.out.println("结论: public synchronize void 是将锁加载了对象上，不是class上");
    }
}
