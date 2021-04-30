// Write a program to print Fibonacci series of given range. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n==0 || n==1){
            System.out.println(n);
        }
        else{
        int a=1;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            
        }
        }
    }
}

//Input 4
//Output 1 1 2 3

//Input 2
//Output 1 1
