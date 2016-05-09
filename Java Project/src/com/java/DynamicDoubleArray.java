package com.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * There are N sequences. All of them are initially empty, and you are given a variable lastans=0. You are given Q queries of two different types:
"1 x y" - Insert y at the end of the ((x⊕lastans) mod N)th sequence.
"2 x y" - Print the value of the (y mod size)th element of the ((x⊕lastans) mod N)th sequence. Here, size denotes the size of the related sequence. Then, assign this integer to lastans.
Note: You may assume that, for the second type of query, the related sequence will not be an empty sequence. Sequences and the elements of each sequence are indexed by zero-based numbering.
The ⊕ symbol denotes the xor operation. You can get more information about it from Wikipedia. It is defined as ^ in most of the modern programming languages.
Input Format
The first line consists of N, number of sequences, and Q, number of queries, separated by a space. The following Q lines contains one of the query types described above.
Constraints 
1≤N,Q≤105 
0≤x≤109 
0≤y≤109
Output Format
For each query of type two, print the answer on a new line.
Sample Input
2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
Sample Output
7
3
 * */
public class DynamicDoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer>[] sequences = new List[n];
        for (int n_i = 0; n_i < n; n_i++) {
            sequences[n_i] = new ArrayList<>();
        }
        int lastans = 0;
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sequence = sequences[(x^lastans)%n];
            switch (t) {
                case 1:
                    sequence.add(y);
                    break;
                case 2:
                    lastans = sequence.get(y%sequence.size());
                    System.out.println(lastans);
                    break;
            }
        }
	}

}

