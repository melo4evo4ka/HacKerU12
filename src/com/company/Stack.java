package com.company;

public class Stack {
    public static void main(String[] args) {
    method1();
        System.out.println("main");
    }

    public static void method1() {
        method2();
        System.out.println("method1");

    }
    public static void method2() {
        method3();
        System.out.println("method2");

    }
    public static void method3 () {

    }
}
