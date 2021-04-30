// Write a program to check given number is Armstrong number or not. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double s=0;
        int t=n;
        while(n!=0){
            int d = n%10;
            s=s+Math.pow(d,3);
            n=n/10;
        }
        if(s==t){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

//Input 153 
//Output true
//Input 54 
//Output false
