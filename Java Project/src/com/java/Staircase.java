package com.java;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        int num  = Integer.parseInt(sc.nextLine().trim());
        test(num);
        
    }
	
	 static void test(int num){
		for(int j=0;j<num;j++){
            for(int i=1;i<=num;i++){
                System.out.print(i<num-j?" ":"#");
            }
            System.out.println("");
        }
	}

}
