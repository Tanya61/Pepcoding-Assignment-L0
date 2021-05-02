// Write a program to find out prime factor of given number. 

import java.util.*;
public class Main{
    public static void primeFactors(int n)
    {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
  
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
  
       if (n > 2)
            System.out.print(n);
    }
  
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        primeFactors(n);
    }
}

//Input 1092
//Output 2 2 3 7 13
