// Write a program to convert octal number to decimal number. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int ans=0;
        int d=0;
        while(n!=0){
            int r= n%10;
            ans+=r*(int)Math.pow(8,d);
            n=n/10;
            d++;
        }
        System.out.println(ans);
    }
}

//Input:121
//Output:81
