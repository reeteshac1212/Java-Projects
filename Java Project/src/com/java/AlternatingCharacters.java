package com.java;

import java.util.Scanner;

/*
 * Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters AA and BB only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format

The first line contains an integer TT, i.e. the number of test cases. 
The next TT lines contain a string each.

Output Format

For each test case, print the minimum number of deletions required.

Constraints

1≤T≤101≤T≤10 
1≤1≤ length of string ≤105≤105
Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
Sample Output

3
4
0
0
4
Explanation

AAAA ⟹⟹ A, 3 deletions
BBBBB ⟹⟹ B, 4 deletions
ABABABAB ⟹⟹ ABABABAB, 0 deletions
BABABA ⟹⟹ BABABA, 0 deletions
AAABBB ⟹⟹ AB, 4 deletions because to convert it to AB we need to delete 2 A's and 2 B's
 */
public class AlternatingCharacters {
	 public int countReductions(String str) {
			int count = 0;
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(i - 1)) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int testCases = Integer.parseInt(scanner.nextLine());
			AlternatingCharacters alternatingCharacters = new AlternatingCharacters();
			for (int i = 0; i < testCases; i++) {
				String str = scanner.nextLine();
				int count = alternatingCharacters.countReductions(str);
				System.out.println(count);
			}
		}
}
