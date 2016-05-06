package com.java;
import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        double negativeCount=0.0,positiveCount=0.0,zeroCount=0.0;
        for(int i=0;i<numCases;i++){
            int num = sc.nextInt();
            if(num<0){
                negativeCount++;
            }else if(num>0){
                positiveCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f",positiveCount/numCases,negativeCount/numCases,zeroCount/numCases);
    }
}