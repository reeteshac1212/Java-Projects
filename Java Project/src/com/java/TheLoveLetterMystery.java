package com.java;
/*
 * James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can reduce the value of a letter, e.g. he can change d to c, but he cannot change c to d.
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

Input Format

The first line contains an integer TT, i.e., the number of test cases. 
The next TT lines will contain a string each. The strings do not contain any spaces.

Constraints 
1≤T≤101≤T≤10 
1≤1≤ length of string ≤104≤104 
All characters are lower case English letters.

Output Format

A single line containing the number of minimum operations corresponding to each test case.

Sample Input

4
abc
abcba
abcd
cba
Sample Output

2
0
4
2
Explanation

For the first test case, abc -> abb -> aba.
For the second test case, abcba is already a palindromic string.
For the third test case, abcd -> abcc -> abcb -> abca = abca -> abba.
For the fourth test case, cba -> bba -> aba.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TheLoveLetterMystery {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int T = Integer.parseInt(br.readLine());
	        for(int i = 0; i < T; i++) {
	            String s = br.readLine();
	            System.out.println(reduction(s));
	        }
	    }

	    static int reduction(String s) {
	        int sum = 0;
	        for(int i = 0; i < s.length()/2; i++) {
	            sum += necessaryMoves(s.charAt(i), s.charAt(s.length()-1-i));
	        }
	        return sum;
	    }

	    static int necessaryMoves(char a, char b) {
	        return Math.abs((int) a - (int) b);
	    }
}
