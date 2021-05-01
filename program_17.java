// Write a program to find out sum of digit of given number. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println(sum);
    }
}

//Input 123
//Output 6
