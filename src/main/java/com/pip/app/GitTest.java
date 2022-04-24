package com.pip.app;

/**
 * @Author: King
 * @Date: 2022/4/24
 * @Description: TODO 一句话描述该类的功能
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello,Git1!");
        System.out.println("hello,Git2!");
        System.out.println("hello,Git3!");
        System.out.println("hello,Git4!-hot fix");
        System.out.println("master 测试合并冲突");
        System.out.println("hot fix 测试冲突");
        System.out.println("push 测试");
        System.out.println("pull 测试");

        GitTest gitTest = new GitTest();//使用对象的非静态方法需要创建对象
        int a = 5;
        int b = 10;
        gitTest.sum(a,b);// 通过对象名去调用求和的方法
        int a2 = 23;
        int b2 = 12;
        gitTest.sum(a2,b2);// 通过对象名去调用求和的方法
        int a3 = 53;
        int b3 = 10;
        gitTest.sum(a3,b3);// 通过对象名去调用求和的方法
    }

    public void sum(int x,int y){
        int z = x + y;
        System.out.println("z = " + z);
    }
}
