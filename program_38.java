// Write a program for swapping of two string. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b= scn.nextLine();
        System.out.println("Before Swapping string 1 = "+ a+" & string 2 = "+b);
        a=a+b;
        b = a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After Swapping string 1 = "+ a+" & string 2 = "+b);
    }
}
/*
Input: abc
       def
       
Output:
Before Swapping string 1 = abc  & string 2 = def
After Swapping string 1 = def & string 2 = abc 
*/
