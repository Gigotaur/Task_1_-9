package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sideA = readNumber("Значение первого катета прямоугольного треугольника: ");
        double sideB = readNumber("Введите значение второго катета прямоугольного треугольника: ");

        double sideC = calculateHypothenuza(sideA, sideB);

        if (checkNum(sideA, sideB, sideC)){
            System.out.println("Треугольник существует");
        }
        else {
            System.out.println("Треугольник не существует");
            return;
        }

        double area = calculateArea(sideA, sideB);
        double perimetr = calculatePerimetr(sideA, sideB, sideC);

        System.out.printf("Площадь прямоугольного треугольника равна: %.4f%n", area);
        System.out.printf("Периметр прямоугольногот реугольника равен: %.4f%n", perimetr);
    }

    private static double readNumber(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        return side;
    }

    private static double calculateHypothenuza(double sideA, double sideB) {
        double sideC = Math.sqrt(sideA * sideA + sideB * sideB);
        return sideC;
    }

    private static double calculateArea(double sideA, double sideB) {
        double area = (sideA * sideB / 2);
        return area;
    }

    private static double calculatePerimetr(double sideA, double sideB, double sideC) {
        double perimetr = (sideA + sideB + sideC);
        return perimetr;
    }

    private static boolean checkNum(double sideA, double sideB, double sideC) {
       return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }
}
