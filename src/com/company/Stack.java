package com.company;
/*
- Создать 3 статических метода method1(), method2(), method3()
- Метод main должен вызывать method1(), метод method1() должен вызывать method2(), метод method2() должен вызывать method3()
- В конце каждого метода, в том числе и main, необходимо добавить sout с выводом названия метода, в котором он расположен
- Запустить приложение и посмотреть в консоли в каком порядке вызываются методы Вывод в консоль должен получиться такой:
method3
method2
method1
main
- Расставить точки останова в каждом методе, запустить в Debug режиме и на каждом шаге наблюдать как ведет себя стэк вызовов
* вызвать ошибку stackOverFlow и вызвать ошибку OutOfMemory
 */
public class Stack {
    public static void main(String[] args) {
        method1();
        System.out.println("main");
    }

    public static void method1() {
        //method1(); Exception in thread "main" java.lang.StackOverflowError
        method2();
        System.out.println("method1");

    }
    public static void method2() {
        method3();
        System.out.println("method2");

    }
    public static void method3 () {
        System.out.println("method3");
        //method2();
    }
}
