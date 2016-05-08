package com.java;


import java.util.*;


public class FindDigits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numCases;i++){
            String numberStr = sc.nextLine();
            int number = Integer.parseInt(numberStr);
            String[]numberArray = numberStr.trim().split("");
            int count = 0;
            for(String num:numberArray){
                if(!num.equals("") && !num.equals("0") && number%Integer.parseInt(num)==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}