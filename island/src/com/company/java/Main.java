package com.company.java;


import java.util.Scanner;

import static com.company.java.Map.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter map parameters: \nrow = ");
        int row = scanner.nextInt();
        System.out.print("col = ");
        int col = scanner.nextInt();
        System.out.println();

        System.out.println("Enter the map where the islands are marked with '1' and the water with '0'");
        int[][] mtrx = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mtrx[i][j] = scanner.nextInt();
            }
        }
        Map map = new Map(mtrx ,row, col);

//        int[][] mtrx = {
//                {0, 0, 1, 1, 0, 1, 1},
//                {0, 1, 0, 1, 0, 0, 1},
//                {0, 1, 0, 1, 0, 0, 1},
//                {0, 1, 0, 0, 1, 1, 1}
//        };
//        Map map = new Map(mtrx ,4, 7);


        map.printMap();

        System.out.println("number of islnds is: " + map.numOfIslands());
        System.out.println("after mangling");
        map.printMap();
    }
}
