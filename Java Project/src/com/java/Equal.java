package com.java;
/*
 * Christy is interning at HackerRank. One day she has to distribute some chocolates to her colleagues. She is biased towards her friends and may have distributed the chocolates unequally. One of the program managers gets to know this and orders Christy to make sure everyone gets equal number of chocolates.

But to make things difficult for the intern, she is ordered to equalize the number of chocolates for every colleague in the following manner,

For every operation, she can choose one of her colleagues and can do one of the three things.

She can give one chocolate to every colleague other than chosen one.
She can give two chocolates to every colleague other than chosen one.
She can give five chocolates to every colleague other than chosen one.
Calculate minimum number of such operations needed to ensure that every colleague has the same number of chocolates. 

Input Format

First line contains an integer TT denoting the number of testcases. TT testcases follow. 
Each testcase has 22 lines. First line of each testcase contains an integer NN denoting the number of co-interns. Second line contains N space separated integers denoting the current number of chocolates each colleague has.

Output Format

TT lines, each containing the minimum number of operations needed to make sure all colleagues have the same number of chocolates.

Constraints

1<=T<=1001<=T<=100
1<=N<=100001<=N<=10000
Number of initial chocolates each colleague has < 10001000
Sample Input

1
4
2 2 3 7
Sample Output

2
Explanation

1st operation: Christy increases all elements by 1 except 3rd one 
2 2 3 7 -> 3 3 3 8
2nd operation: Christy increases all element by 5 except last one
3 3 3 8 -> 8 8 8 8
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Equal {

	public static int equal(int[] arr, int n){
        int min=Integer.MAX_VALUE;
        int c =0;
        for(int i=0;i<n;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        
        for(int i=0;i<n;i++){
             c += (arr[i]-min)/5;
            if((arr[i]-min)%5 !=0){
                if((arr[i]-min) % 5 <=2)
                    c+=1;
                else
                    c+=2;
            }
        }
        return c;
    }
    
    
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int n=s.nextInt();

        for(int i=0;i<n;i++){
            int size = s.nextInt();  
            int[] arr = new int[size];
            for(int j=0; j<size;j++){
                arr[j]=s.nextInt();
            }
            int out = equal(arr, size);
            System.out.println(out);
        }
    }

}
