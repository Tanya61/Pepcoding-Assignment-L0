// Write a program to add two numbers without using addition operator. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ans = a-(-b);
        System.out.println(ans);
    }
}

//Input 3 4
//Output 7
