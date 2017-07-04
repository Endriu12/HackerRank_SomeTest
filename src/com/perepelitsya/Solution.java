package com.perepelitsya;

import java.util.Scanner;

/**
 * Created by Andriu on 7/4/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = 1;
        int n = in.nextInt();
        if (n <= 10 && n >= 1) {
            for (int a0 = 0; a0 < n; a0++) {
                int cycle = in.nextInt();
                if (cycle <= 60 && cycle >= 0) {
                    if (cycle == 0) {
                        height = 1;
                    } else {
                        for (int j = 0; j < cycle; j++) {
                            if (j % 2 == 0) {
                                height += height;
                            } else {
                                height += 1;
                            }
                        }
                    }
                    System.out.println(height);
                    height = 1;
                } else {
                    System.out.println("N must be 0<=N<=60");
                }
            }
        } else {
            System.out.println("T must be 1<=T<=10");
        }
    }
}
