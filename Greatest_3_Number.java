// Assignment 2 
//take 3 user input and find greatest

import java.util.*;
class Greatest_3_Number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three Numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int n;
n=((num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3));
	System.out.println("Greatest Number: "+n);

	
}
}