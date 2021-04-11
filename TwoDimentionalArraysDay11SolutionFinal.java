package com.mano.thirtyDaysOfCode;

import java.util.*;

public class TwoDimentionalArraysDay11SolutionFinal {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[][] arr = new int[6][6];
        for(int i=0;i<6;i++){
            String[] arrRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
            //scanner.close();
            for (int j=0;j<6;j++){
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
        int highValue = -9*6;
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){

                int sum = arr[i][j] + arr[i][j+1] +arr[i][j+2];
                sum+= arr[i+1][j+1];
                sum+= arr[i+2][j]+ arr[i+2][j+1] + arr[i+2][j+2];

                if(sum>highValue){
                    highValue = sum;
                }
            }
        }
        System.out.println(highValue);
    }
}
