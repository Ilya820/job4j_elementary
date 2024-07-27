package ru.job4j.condition;

public class RectangleArea {
    public static double square(double width, double height) {
        return (width / (2 * (height + 1))) * height * (width / (2 * (height + 1)));
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println("width = 4, height = 1, s = 1, real = " + result);
    }
}
