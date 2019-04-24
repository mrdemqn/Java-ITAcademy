package com.gmail.mrdemqnvip.arrays.array_butterfly;

public class Butterfly {

    public static void main(String[] args) {

        int arrButt[][] = {{1,1,1,1,1},{0,1,1,1,0},{0,0,1,0,0},{0,1,1,1,0},{1,1,1,1,1}};
        arrButt[0][0] = 1;
        arrButt[1][1] = 1;
        arrButt[2][2] = 1;
        arrButt[3][3] = 1;
        arrButt[4][4] = 1;
        for(int i = 0; i<arrButt.length; i++){
            for(int j = 0; j<arrButt[i].length; j++){

                System.out.print(arrButt[i][j] + " ");
            }
            System.out.println();
        }
    }
}