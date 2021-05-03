// Write a program to find out G.C.D. of two numbers. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int 
        div=n1,dvd=n2;
        while(dvd%div!=0){
            int rem = dvd%div;
            dvd=div;
            div=rem;
        }
        int gcd = div;
        
        System.out.println(gcd);
    }
}

//Input 9 6
//Output 3
