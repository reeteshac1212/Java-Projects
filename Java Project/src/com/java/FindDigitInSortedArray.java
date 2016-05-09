package com.java;


import java.util.HashMap;
import java.util.Scanner;

/*
 * This is a simple challenge to get things started. Given a sorted array (arar) and a number (VV), can you print the index location of VV in the array?
The next section describes the input format. You can often skip it, if you are using included methods.
Input Format 
There will be three lines of input:
VV - the value that has to be searched.
nn - the size of the array.
arar - nn numbers that make up the array.
Output Format 
Output the index of VV in the array.
The next section describes the constraints and ranges of the input. You should check this section to know the range of the input.
Constraints
1≤n≤10001≤n≤1000
−1000≤V≤1000,V∈ar−1000≤V≤1000,V∈ar
It is guaranteed that VV will occur in arar exactly once.
This "sample" shows the first input test case. It is often useful to go through the sample to understand a challenge.
Sample Input
4
6
1 4 5 7 9 12
Sample Output
1
Explanation 
V=4V=4. The value 44 is the 22nd element in the array, but its index is 11 since array indices start from 00, so the answer is 11.
 */
public class FindDigitInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int SearchNumber=sc.nextInt();
		int arraysize=sc.nextInt();
		int index=Integer.MIN_VALUE;
		//HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		//hm.put(SearchNumber, null);
		for(int i=0;i<arraysize;i++){
			int n=sc.nextInt();
			if(n==SearchNumber){
				index=i;
			}
		}
		System.out.println(index);
	}

}
