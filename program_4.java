 //Write a program to check given number is strong number or not. 

import java.util.*;
public class Main{
    public static int fact(int n){
        if(n==1){
            return n;
        }
        else return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s=0;
        int t=n;
        while(n!=0){
            int d=n%10;
            s=s+fact(d);
            n=n/10;
        }
        
        if(t==s){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

//Input 145
//Output true

//Input 311
//Output false
