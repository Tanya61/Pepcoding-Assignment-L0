//Write a macro that swaps two numbers. WAP to use it.

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b= scn.nextInt();
        System.out.println("Before Swapping a - " + a + " b - "+b);
        int t=a;
        a=b;
        b=t;
         System.out.println("After Swapping a - " + a + " b - "+b);
    }
}

//Input : 60 80
//Output : Before Swapping a - 60 b - 80
//         After Swapping a - 80 b - 60
