package com.java;
/*
 * You are given a class Solution and its main method in the editor. In each test cases, it takes an input chch which represents a choice of the following:

ch=1ch=1 represents the volume of a cube that has to be calculated where aa represents the length of the sides of the cube.
ch=2ch=2 represents the volume of a cuboid that has to be calculated where l,b,hl,b,h represent the dimensions of a cuboid.
ch=3ch=3 represents the volume of a hemisphere that has to be calculated where rr represents the radius of a hemisphere.
ch=4ch=4 represents the volume of a cylinder that has to be calculated where r,hr,h represent the radius and height of the cylinder respectively.
Your task is to create the class Calculate and the required methods so that the code prints the volume of the figures rounded to exactly 33 decimal places.

In case any of the values are ≤0≤0, print "java.lang.NumberFormatException: All the values must be positive" without quotes and terminate the program.

Note: Use Math.PI or 3.141592653.14159265 as the value of pi.

Input Format

First line contains TT, the number of test cases. Each test case contains ch, representing the choice as given in the problem statement.

When ch=1, Next line contains aa, length of the sides of the cube.
When ch=2, Next three lines contain ll, bb, hh representing length, breadth and height of the cuboid respectively. ll, bb, hh will be in three separate lines
When ch=3, Next line contains rr, the radius of the hemisphere
When ch=4, Next two lines contain rr, hh representing the radius and height of the cylinder respectively. rr, hh will be in two separate lines.
Note: You have to determine the data type of each parameter by looking at the code given in the main method.

Constraints 
1≤ch≤41≤ch≤4 
−100≤a,l,b,h,r≤100−100≤a,l,b,h,r≤100 
There will be at most 33 digits after decimal point in input.

Output Format

For each test case, print the answer rounded up to exactly 3 decimal places in a single line. For example, 1.2345 should be rounded to 1.235, 3.12995 should be rounded to 3.130.

Sample Input 1

2
1
4
4
67.89
-98.54
Sample Output 1

64.000
java.lang.NumberFormatException: All the values must be positive
Explanation 
There are two test cases. In the first test case ch=1ch=1, means you have to calculate the volume of a cube. The next line contains the aa=4, means the side of the cube is 44. So the volume of the cube is 64.00064.000. 
In the second test case, you have to calculate volume of a cylinder. But the height of the cylinder is negative, so an exception is thrown.

Sample Input 2

1
3
1.02
Sample Output 2

2.223
 */
import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

class Calculate 
{
    class Output{
    
        public void display(double volume)
        {
            System.out.printf("%.3f\n",volume);
        }
    }
    
    
    Output output;
    Scanner sc;
    public Calculate() 
    {
        output = new Output();
        sc = new Scanner(System.in);
    }
    public int getINTVal()
    {
       
        int a = sc.nextInt();
        if(a<=0){throw new NumberFormatException("All the values must be positive");}
        return a;
    }
    public double getDoubleVal()
    {
        double a = sc.nextDouble();
        if(a<=0){throw new NumberFormatException("All the values must be positive");}
        return a;
    }
    public static Get_Vol get_Vol()
    {  
        
        return new Get_Vol();
    }
}

class Get_Vol extends Calculate 
{
    double main(int val) throws IOException
    {
            
        return (val*val*val);
    }
    double main(int val, int val2, int val3) throws IOException
    {
        
        
        return val*val2*val3;
    }
    double main(double val) throws IOException
    {
       
       double radius = Math.PI*(val*val*val) * (2.0/3.0);
  
        return radius;
    }
    double main(double val, double val2)throws IOException
    {
        
       
        return Math.PI*(val*val)*val2; 
    }
    
}
public class CalculatingVolume {

	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();		
		try{
			Calculate cal=new Calculate();
			int T=cal.getINTVal();
			while(T-->0){
			double volume = 0.0d;		
			int ch=cal.getINTVal();			
			if(ch==1){
			
				int a=cal.getINTVal();
				volume=Calculate.get_Vol().main(a);
				
				
			}
			else if(ch==2){
			
				int l=cal.getINTVal();
				int b=cal.getINTVal();
				int h=cal.getINTVal();
				volume=Calculate.get_Vol().main(l,b,h);
				
			}
			else if(ch==3){
			
				double r=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r);
				
			}
			else if(ch==4){
			
				double r=cal.getDoubleVal();
				double h=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r,h);
				
			}
			cal.output.display(volume);
			}
					
		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
		
		
	}
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//
