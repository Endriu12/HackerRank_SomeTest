package com.perepelitsya;

import java.util.Scanner;

/**
 * Created by Andriu on 7/4/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = 1; //it's height of Utopian Tree
        int n = in.nextInt();
        if (n <= 10 && n >= 1) { //Restrictions on n
            for (int a0 = 0; a0 < n; a0++) {
                int cycle = in.nextInt();
                if (cycle <= 60 && cycle >= 0) { //Restrictions on cycles
                    //It's our main logic
                    /*
                    if n =  0, we don't change the height
                    if n = another number. For example 3
                    n=3;  we use cycle j = 0, j = 1, j = 2
                    1. 0 % 2 == 0   false,  so height += 1;    height = 2
                    2. 1 % 2 == 0   false,  so height += 1;    height = 3
                       2 % 2 == 0   true,   so height += height;    height =6.
                     */
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
                    System.out.println(height);//it's our result
                    height = 1; //after all we change height of tree to his start value
                } else {
                    System.out.println("N must be 0<=N<=60");
                }
            }
        } else {
            System.out.println("T must be 1<=T<=10");
        }
    }
}
