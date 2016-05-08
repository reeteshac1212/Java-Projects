package com.java;

import java.util.Scanner;

/*
 * Objective 
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given an integer, nn, perform the following conditional actions:

If nn is odd, print 𝚆𝚎𝚒𝚛𝚍Weird.
If nn is even and in the inclusive range of 22 to 55, print 𝙽𝚘𝚝 𝚆𝚎𝚒𝚛𝚍Not Weird.
If nn is even and in the inclusive range of 66 to 2020, print 𝚆𝚎𝚒𝚛𝚍Weird.
If nn is even and greater than 2020, print 𝙽𝚘𝚝 𝚆𝚎𝚒𝚛𝚍Not Weird.
Complete the stub code provided in your editor to print whether or not nn is weird.

Input Format

A single line containing a positive integer, nn.

Constraints

1≤n≤1001≤n≤100
Output Format

Print 𝚆𝚎𝚒𝚛𝚍Weird if the number is weird; otherwise, print 𝙽𝚘𝚝 𝚆𝚎𝚒𝚛𝚍Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0: n=3n=3 
nn is odd and odd numbers are weird, so we print 𝚆𝚎𝚒𝚛𝚍Weird.

Sample Case 1: n=24n=24 
n>20n>20 and nn is even, so it isn't weird. Thus, we print 𝙽𝚘𝚝 𝚆𝚎𝚒𝚛𝚍Not Weird.
 */
public class ConditionalStatements {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else{
	          if(n>=2&&n<=5){
	              ans = "𝙽𝚘𝚝 𝚆𝚎𝚒𝚛𝚍.";
	          }
	          if (n>=6&&n<=20){
	              ans = "𝚆𝚎𝚒𝚛𝚍."; 
	          }
	          if(n>20){
	              ans = "𝙽𝚘𝚝 𝚆𝚎𝚒𝚛𝚍.";
	          }
	         // Complete the code 
	      }
	      System.out.println(ans);
	   }

}
