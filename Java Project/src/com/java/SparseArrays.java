package com.java;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * There are N strings. Each string's length is no more than 20 characters. There are also Q queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.
Input Format
The first line contains N, the number of strings.
The next N lines each contain a string.
The N+2nd line contains Q, the number of queries.
The following Q lines each contain a query string.
Constraints
1≤N≤1000 
1≤Q≤1000 
1≤ length of any string≤20
 * */
public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<String, Integer> hmap = new HashMap<>();
		String key="";
		Integer value;
		for(int i=0;i<n;i++){
			key = sc.next();
			value = hmap.get(key);
			if(value != null){
				hmap.put(key, value+1);
			}
			else
				hmap.put(key,1);
		}
		
		int n1 = sc.nextInt();
		for(int i=0;i<n1;i++){
			String input =  sc.next();
			if(hmap.get(input) == null){
				System.out.println("0");
			}
			else
				System.out.println(hmap.get(input));
		}
	}

}
