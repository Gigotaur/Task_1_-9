package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double side_A = readNumber("Значение первого катета прямоугольного треугольника: ");
        double side_B = readNumber("Введите значение второго катета прямоугольного треугольника: ");

        double side_C = calculateHypothenuza(side_A, side_B);

        checkThisOut(side_A, side_B, side_C);

        double area = calculateArea(side_A, side_B);
        double perimetr = calculatePerimetr(side_A, side_B, side_C);

        System.out.printf("Площадь прямоугольного треугольника равна: %.4f%n", area);
        System.out.printf("Периметр прямоугольногот реугольника равен: %.4f%n", perimetr);
    }

    private static double readNumber(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        double side;
        side = input.nextDouble();
        return side;
    }

    private static double calculateHypothenuza(double side_A, double side_B) {
        double side_C = Math.sqrt(side_A * side_A + side_B * side_B);
        return side_C;
    }

    private static double calculateArea(double side_A, double side_B) {
        double area = (side_A * side_B / 2);
        return area;
    }

    private static double calculatePerimetr(double side_A, double side_B, double side_C) {
        double perimetr = (side_A + side_B + side_C);
        return perimetr;
    }

    private static void checkThisOut(double side_A, double side_B, double side_C) {
        if ((side_A + side_B > side_C) && (side_A + side_C > side_B) && (side_B + side_C > side_A)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }

}
