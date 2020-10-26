package com.company.number2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input A = ");
        double A = scanner.nextDouble();
        System.out.print("Input B = ");
        double B = scanner.nextDouble();
        System.out.print("Input C = ");
        double C = scanner.nextDouble();
        System.out.print("Input R = ");
        double R = scanner.nextDouble();

        checkPossible(A, B, C, R);

        if(checkExistence(A, B, C)) {
            checkPossible (A, B, C, R);
        } else {
            System.out.println("Error");
        }

    }
    public static void checkPossible(double A, double B, double C, double R) {
        Locale.setDefault(Locale.ROOT);
        double p, r;

        p = (A + B + C) / 2;
        r = Math.sqrt(((p - A) * (p - B) * (p - C)) / p);

        if (r == R) {
            System.out.println("you can enter");
        } else {
            System.out.println("cannot be entered");
        }
    }

    public static boolean checkExistence(double A, double B, double C) {
        if (A + B > C) {
            if (A + C > B)
                if (B + C > A )
                    return true;
        }

        return false;
    }
}