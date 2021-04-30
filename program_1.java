// Write a program to check given number is perfect number or not. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i*i!=n){
                    s=s+i+n/i;
                }else{
                    s+=i;
                }
            }
        }
        if(n==s && n!=1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

//Input 28
//Output true
//Input 496
//Output true
