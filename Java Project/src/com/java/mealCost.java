package com.java;

import java.util.Scanner;

public class mealCost {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tipPercent1= mealCost*tipPercent/100;
       // System.out.println(tipPercent);
        double taxPercent1= mealCost*taxPercent/100;
        //System.out.println(taxPercent);
        int totalCost = (int) Math.round(mealCost+tipPercent1+taxPercent1);
        System.out.println(totalCost);
        // Print your result
    }

}
