//WAP to reverse a number.

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev=0;
        while(n!=0){
            int d= n%10;
            rev = rev*10+d;
            n=n/10;
        }
        System.out.println("Reversed number is : "+rev);
    }
}

//Input : 1234
//Output : 4321
