// Write a program to subtract two numbers without using subtraction operator. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ans = a+ ~b +1;
        System.out.println(ans);
    }
}

//Input 7 4
//Output 3
