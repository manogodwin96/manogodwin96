package com.mano.thirtyDaysOfCode;

import java.util.*;

public class BinaryNumbersDay10Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");

        System.out.println("given input int : "+n);
        scanner.close();

        String base2String = convertedBase2(n);
        List<String> base2StringList = splitBase2(base2String);
        Optional<String> highestNumber = base2StringList.stream().sorted(Comparator.reverseOrder()).findFirst();
        String highestNumberString = highestNumber.get();
        System.out.println(highestNumberString.length());

    }
    // convert base 10 to base 2
    public  static String convertedBase2(int number){
        String base2 = "";
        while (number >0){
            base2 = number % 2 + base2;
            number = number / 2;
            System.out.println("==== number after==="+number);
        }
        return base2;
    }

    // split the converted with the converted 1
    public static List<String> splitBase2(String base2String){
        return Arrays.asList(base2String.split("0"));
    }

}
