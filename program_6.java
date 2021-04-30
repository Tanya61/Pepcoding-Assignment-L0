// Write a program to check given number is palindrome number or not. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num =n;
        double rev=0;
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        n=num;
        while(n>0){
            int d=n%10;
            rev = rev+(d*Math.pow(10,c-1));
            c--;
            n=n/10;
        }
        if(rev==num){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

//Input 9876
//Output false

//Input 9889
//Output true
