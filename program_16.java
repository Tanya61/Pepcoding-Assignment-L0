// Write a program to reverse any number.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev=0,c=-1;
        int t=n;
        while(t!=0){
            c++;
            t=t/10;
        }
        while(n!=0){
            int d= n%10;
            rev = rev+d*(int)Math.pow(10,c);
            n=n/10;
            c--;
        }
        
        System.out.println(rev);
    }
}

//Input 789
//Output 987
