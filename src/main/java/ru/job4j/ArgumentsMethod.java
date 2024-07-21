package ru.job4j;

public class ArgumentsMethod {
    public static void hello(String name, int age) {
        System.out.println(name + age);
    }

    public static void main(String[] args) {
        String name = "Hello, Job4j, age = ";
        int age = 6;
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
        ArgumentsMethod.hello(name, age);
    }
}
