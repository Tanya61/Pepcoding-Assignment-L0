// Write a program to swap two numbers without using third variable. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Before swapping a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a="+a+" b="+b);
    }
}

//Input : 7 9
//Output : Before swapping a=7 b=9
//         After swapping a=9 b=7
