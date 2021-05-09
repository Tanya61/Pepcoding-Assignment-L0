// Write a function that checks whether a given string is Palindrome or not. Use this function to find whether the string entered by user is Palindrome or not. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev=0,t=n;
        while(t!=0){
            int d= t%10;
            rev=rev*10+d;
            t=t/10;
        }
        if(rev==n){
            System.out.println("Palndrome Number");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}

//Input : 5665
//Output : Palndrome Number
