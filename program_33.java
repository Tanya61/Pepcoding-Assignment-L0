// Write a program to find out H.C.F. of two numbers. 

import java.util.*;
public class Main {
   public static void main(String args[]){
      int a, b, i, hcf = 0;
      Scanner scn = new Scanner(System.in);
      a = scn.nextInt();
      b = scn.nextInt();
      for(i = 1; i <= a || i <= b; i++) {
         if( a%i == 0 && b%i == 0 )
         hcf = i;
      }
      System.out.println("HCF of given two numbers is ::"+hcf);
   }
}

//Input : 625 125
//Output : 125
