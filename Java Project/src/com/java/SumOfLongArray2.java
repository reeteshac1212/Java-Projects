package com.java;

import java.util.Scanner;

public class SumOfLongArray2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.println(sum(arr));
    }
    public static long sum(int arr[]){
        long sum=0;
        for(int arr_i=0; arr_i < arr.length; arr_i++){
            sum+=arr[arr_i];
        }
        return sum;
    }

}
