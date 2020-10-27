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

        if (checkExistenceOfATriangle(a, b, c)) {
            if (checkPossibilityOfTheExistence(a, b, c, r)) {
                System.out.println("you can enter");
            }
            if (checkPossibilityOfTheExistence(a, b, c, r) == false) {
                System.out.println("cannot be entered");
            }
        } else {
            System.out.println("the triangle can't exist");
        }
    }

    public static boolean checkPossibilityOfTheExistence(double a, double b, double c, double r) {
        double p, expectedR;

        p = (a + b + c) / 2;
        expectedR = Math.sqrt(((p - a) * (p - b) * (p - c)) / p);

        if (expectedR == r) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkExistenceOfATriangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }

        return false;
    }
}