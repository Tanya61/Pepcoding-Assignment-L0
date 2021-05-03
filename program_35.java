//Write a program to swap two numbers.

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Before swapping a="+a+" b="+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping a="+a+" b="+b);
    }
}

//Input : 7 4 
//Output : Before swapping a=7 b=4
//         After swapping a=4 b=7
