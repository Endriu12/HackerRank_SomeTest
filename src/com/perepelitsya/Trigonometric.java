package com.perepelitsya;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by Andriu on 7/6/2017.
 */
public class Trigonometric {
    //number of members row
    private static final float N = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (1 <= N && N <= 50) {
            for (int i = 0; i < N; i++) {
                double x = sc.nextDouble();
                if (x > 0 && x < 10) {
                        System.out.println(reduction(seq_sin(x)));
                        System.out.println(reduction(seq_cos(x)));
                } else {
                    System.out.println("Error");
                }
            }
        } else {
            System.out.println("Error");
        }
    }

    //Row sin
    public static double seq_sin(double x) {
        double r = 0;
        for (long n = 0; n < N; n++) {
            r += pow(-1, n) * pow(x, 2 * n + 1) / factorial((int) (2 * n + 1));
        }
        return r;
    }

    // Row cosin
    public static double seq_cos(double x) {
        double r = 0;
        for (long n = 0; n < N; n++) {
            r += pow(-1, n) * pow(x, 2 * n) / factorial((int) (2 * n));
        }
        return r;
    }

    //implemention  method Rounding
    public static double round(double a) {
        if (a - Math.floor(a) < Math.ceil(a) - a)
            return Math.floor(a);
        else
            return Math.ceil(a);
    }

    //implemention  method Reduction of number
    public static double reduction(double a) {
        return round(a * 1000) / 1000;
    }


    //simple implemention method factorial
    static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
