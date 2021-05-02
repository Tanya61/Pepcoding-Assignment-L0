// Write a program for swapping of two numbers without using extra variable. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Before swapping a=" + a + " b=" +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a=" + a + " b=" +b);
    }
}

// Input 3 4
//Output : Before swapping a=3 b=4
//         After swapping a=4 b=3
