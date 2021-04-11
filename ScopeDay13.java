package com.mano.thirtyDaysOfCode;

import java.util.*;

class Difference{
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a){
        this.elements = a;
    }
    public void computeDifference(){
        int lowerValue = 0;
        int higherValue = 0;
        for(int i=0;i<elements.length;i++){
            if(elements[i]<lowerValue || i == 0){
                lowerValue = elements[i];
            }
            if(elements[i]>higherValue || i == 0){
                higherValue = elements[i];
            }
        }
        maximumDifference = Math.abs(higherValue - lowerValue);
    }
}
public class ScopeDay13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.println(difference.maximumDifference);
    }
}
