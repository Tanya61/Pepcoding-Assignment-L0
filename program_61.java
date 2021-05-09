// WAP to compute the sum of the first n terms of the following series :
// S = 1+1/2+1/3+1/4+…… 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double i,s=0.0;
        for(i=1;i<=n;i++){
            s=s+1/i;
        }
        System.out.println("Sum of series is : "+s);
    }
}

//Input : 5
//Output : Sum of series is : 2.283333333333333
