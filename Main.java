package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double side_A, side_B;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите значение первого катета прямоугольного треугольника");
        side_A = input.nextDouble();
        System.out.println("Введите значение второго катета прямоугольного треугольника");
        side_B = input.nextDouble();

        double side_C = calculateHypothenuza(side_A, side_B);

        if (checkThisOut(side_A, side_B, side_C)){
            System.out.println("Треугольник существует");
        }
        else {
            System.out.println("Треугольник не существует");
            return;
        }

        double area = calculateArea(side_A, side_B, side_C);
        double perimetr = calculatePerimetr(side_A, side_B, side_C);

        System.out.printf("Площадь прямоугольного треугольника равна: %.4f%n", area);
        System.out.printf("Периметр прямоугольногот реугольника равен: %.4f%n", perimetr);
    }

    private static double calculateHypothenuza(double side_A, double side_B){
        double side_C = Math.sqrt(side_A * side_B + side_B * side_B);
        return side_C;
    }

    private static double calculateArea (double side_A, double side_B, double side_C) {
        double area = (side_A * side_B / 2);
        return area;
    }

    private static double calculatePerimetr (double side_A, double side_B, double side_C) {
        double perimetr = (side_A + side_B + side_C);
        return perimetr;
    }
    private static boolean checkThisOut (double side_A,  double side_B, double side_C) {
        return (side_A + side_B > side_C) && (side_A + side_C > side_B) && (side_B + side_C > side_A);
    }
}
