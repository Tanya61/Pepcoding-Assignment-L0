// WAP to compute the sum of the first n terms of the following series 
//S =1-2+3-4+5……………. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans;
        if (n % 2 == 1){
            ans = (n + 1) / 2;
        }else{
            ans = -n / 2;
        } 
        System.out.println("Sum of series is : "+ans);
    }
}

//Input : 8
//Output : -4
