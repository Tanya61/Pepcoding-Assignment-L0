// Write a program to find out generic root of any number. 

import java.util.*;
public class Main{
    public static int sum(int n){
        int s=0;
        while(n>0){
            int d= n%10;
            s+=d;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n>=10){
            int s = sum(n);
            if(s>=10){
                n=s;
            }
            else{
                 System.out.println(s);
                 break;
            }
        }
       
    }
}

// Input 78
// Output 6
