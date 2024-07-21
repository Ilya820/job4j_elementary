package ru.job4j;

public class MathFunction {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static double func2(int x) {
        double y = 4 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunction.func1(3);
        double result2 = MathFunction.func2(2);
        double total = result1 + result2;
        System.out.println(total);
    }
}
