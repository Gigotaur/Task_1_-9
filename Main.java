package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner length = new Scanner(System.in);
    double A_side, B_side;
    System.out.println("Введите значение первого катета прямоугольного треугольника");
    A_side = length.nextDouble();
        Scanner width = new Scanner(System.in);
        System.out.println("Введите значение второго катета прямоугольного треугольника");
        B_side = width.nextDouble();
        double C_side = Math.sqrt(A_side*A_side+B_side*B_side);
       // System.out.println(C_side);
        double Square =(A_side*B_side/2);
        System.out.println("Площадь прямоугольного треугольника равна: " + Square);
        double Perimetor =(A_side+B_side+C_side);
        System.out.println("Периметор прямоугольногот реугольника равен: " + Perimetor);
    }
}
