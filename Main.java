package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double side_A, side_B;
        double area = counterArea();
        double perimetr = counterPerimetr();
        Scanner length = new Scanner(System.in);
        System.out.println("Введите значение первого катета прямоугольного треугольника");
        side_A = length.nextDouble();
        Scanner width = new Scanner(System.in);
        System.out.println("Введите значение второго катета прямоугольного треугольника");
        side_B = width.nextDouble();
        return (side_A, side_B);
    }
    private static double Scanner () {
        
        return;
    }


    private static double counterArea () {
        double side_C = Math.sqrt(side_A * side_B + side_B * side_B);
        // System.out.println(side_C);
        area = (side_A * side_B / 2);
        System.out.println("Площадь прямоугольного треугольника равна: " + area);
        return area;
    }

    private static double counterPerimetr () {
        perimetr = (side_A + side_B + side_C);
        System.out.println("Периметор прямоугольногот реугольника равен: " + perimetr);
        return perimetr;
    }
    private static double checkThisOut () {
        
    }
}
