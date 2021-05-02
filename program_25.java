// Write a program to find out NCR factor of given number. 

import java.util.*;
public class Main{
    public static int factorial(int n)
    {
        if(n==1){
            return n;
        }
        return n*factorial(n-1);
        
    }
  
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int ans = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(ans);
    }
}

//Input 4 2
//Output 6
