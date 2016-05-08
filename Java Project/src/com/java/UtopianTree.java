package com.java;

import java.util.Scanner;

/*
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after NN growth cycles?

Input Format

The first line contains an integer, TT, the number of test cases. 
TT subsequent lines each contain an integer, NN, denoting the number of cycles for that test case.

Constraints 
1≤T≤101≤T≤10 
0≤N≤600≤N≤60
Output Format

For each test case, print the height of the Utopian Tree after NN cycles. Each height must be printed on a new line.

Sample Input

3
0
1
4
Sample Output

1
2
7
Explanation

There are 3 test cases.

In the first case (N=0N=0), the initial height (H=1H=1) of the tree remains unchanged.

In the second case (N=1N=1), the tree doubles in height and is 22 meters tall after the spring cycle.

In the third case (N=4N=4), the tree doubles its height in spring (H=2H=2), then grows a meter in summer (H=3H=3), then doubles after the next spring (H=6H=6), and grows another meter after summer (H=7H=7). Thus, at the end of 4 cycles, its height is 77 meters.
 */
public class UtopianTree {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int nhalf = n/2;
            int count=0;
            int h=1,i=1;
            while(count<nhalf){
                h=2*i+1;
                i=h;
                count++;
            }
            if(n%2==1){
                h=2*h;
            }
            System.out.println(h);
        }
    }

}
