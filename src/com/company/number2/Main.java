package com.company.number2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a = ");
        double a = scanner.nextDouble();
        System.out.print("Input b = ");
        double b = scanner.nextDouble();
        System.out.print("Input c = ");
        double c = scanner.nextDouble();
        System.out.print("Input r = ");
        double r = scanner.nextDouble();

        if (checkExistenceTriangle(a, b, c)) {
            if (checkPossibilityExistence(a, b, c, r)) {
                System.out.println("you can enter");
            }
            if (!checkPossibilityExistence(a, b, c, r)) {
                System.out.println("cannot be entered");
            }
        } else {
            System.out.println("the triangle can't exist");
        }
    }

    public static boolean checkPossibilityExistence(double a, double b, double c, double r) {

        double p = (a + b + c) / 2;
        double expectedR = Math.sqrt(((p - a) * (p - b) * (p - c)) / p);

        return expectedR == r;
    }

    public static boolean checkExistenceTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}