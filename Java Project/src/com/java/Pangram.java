package com.java;
/*
 * Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence ss, tell Roy if it is a pangram or not.

Input Format

Input consists of a string ss.

Constraints 
Length of ss can be at most 103103 (1≤|s|≤103)(1≤|s|≤103) and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.

Output Format

Output a line containing pangram if ss is a pangram, otherwise output not pangram.

Sample Input

Input #1

We promptly judged antique ivory buckles for the next prize    
Input #2

We promptly judged antique ivory buckles for the prize    
Sample Output

Output #1

pangram
Output #2

not pangram
Explanation

In the first test case, the answer is pangram because the sentence contains all the letters of the English alphabet.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Pangram {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        //System.out.println(s);
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        String str= s.toLowerCase();
        for(int i=97;i<=122;i++)
            {
            char c =(char)i;
            hm.put(c,0);
            
        }
  
        for(int i=0;i<str.length();i++)
            {
            if(str.charAt(i)!=' ')
                {
                
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
        }
        int flag=0;
              for(char k:hm.keySet())
            {
            
            if(hm.get(k)==0)
                {
                flag=1;
            }
}
        if(flag==0)
            {
            System.out.print("pangram");
        }
        else
            {
            System.out.print("not pangram");
        }
    }
}
