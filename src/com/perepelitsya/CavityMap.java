package com.perepelitsya;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Andriu on 7/4/2017.
 */
public class CavityMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (1 <= n && n <= 100) {
            String[] grid = new String[n];
            char[][] map = new char[n][n];

            //to add value
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next();
                map[i] = grid[i].toCharArray();
            }


            //I check each cell of the array with her neighbors, if  it's bigger then we overwrite it on 'X'.
            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    if (map[i][j] > map[i - 1][j] && map[i][j] > map[i][j - 1] && map[i][j] > map[i][j + 1] && map[i][j] > map[i + 1][j]) {
                        map[i][j] = 'X';
                    }
                }
            }


            //Output  modified array
            for (char c[] : map) {
                String row = new String(c);
                System.out.println(row);
            }
        } else {
            System.out.println("You input irregular number\n Please try again!");
        }
    }
}