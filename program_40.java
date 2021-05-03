// Write a program to convert decimal number to octal number. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans=0,d=0;
        while(n!=0){
            int r= n%8;
            ans+=r*(int)Math.pow(10,d);
            d++;
            n=n/8;
        }
        System.out.println(ans);
    }
}

//Input: 96
//Output:140
