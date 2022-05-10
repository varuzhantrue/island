package com.company.java;

public class Map {
    public int row;
    public int col;
    int[][] map;

    public Map(int[][] map ,int row, int col) {
        this.row = row;
        this.col = col;
        this.map = map;
    }


    private void mapMangling(int[][] mtrx, int i, int j) {

        mtrx[i][j] = -1;
        if (i > 0 && mtrx[i - 1][j] == 1) {
            mapMangling(mtrx, i - 1, j);
        }
        if (i < row - 1 && mtrx[i + 1][j] == 1) {
            mapMangling(mtrx, i + 1, j);
        }
        if (j > 0 && mtrx[i][j - 1] == 1) {
            mapMangling(mtrx, i, j - 1);
        }
        if (j < col - 1 && mtrx[i][j + 1] == 1) {
            mapMangling(mtrx, i, j + 1);
        }
    }

    public void printMap() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int numOfIslands() {
        int count = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (this.map[i][j] == 1) {
                    count++;
                    mapMangling(map, i, j);
                }
            }
        }
        return count;
    }
}
