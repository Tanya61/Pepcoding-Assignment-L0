// Write a program to convert decimal number to binary number. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans=0,d=0;
        while(n!=0){
            int r= n%2;
            ans+=r*(int)Math.pow(10,d);
            d++;
            n=n/2;
        }
        System.out.println(ans);
    }
}

//Input : 9
//Output: 1001
