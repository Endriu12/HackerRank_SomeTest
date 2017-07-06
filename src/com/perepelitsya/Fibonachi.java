package com.perepelitsya;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Andriu on 7/6/2017.
 */
public class Fibonachi {
    public static void main(String[] args) {
        //First of all I need to use BigInteger.
        BigInteger bi1, bi2, bi3 = null;

        Scanner in = new Scanner(System.in);

        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        if (0 <= t1 && t2 <= 2 && 3 <= n && n <= 20) {
            bi1 = BigInteger.valueOf(t1);
            bi2 = BigInteger.valueOf(t2);
            //it's main logic of this programm
            for (int i = 0; i < n - 2; i++) {
                //bil1 + bi2.pow(2) -  Raising the number stored in the object to the power of 2.
                bi3 = bi1.add(bi2.pow(2));
                bi1 = bi2;
                bi2 = bi3;
            }
            System.out.println(bi3);
        }
        else {
            System.out.println("Input valid numbers!");
        }
    }
}