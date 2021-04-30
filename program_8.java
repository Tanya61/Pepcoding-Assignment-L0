// Write a program to solve quadratic equation.  

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double a = scn.nextInt();
        double b = scn.nextInt();
        double c = scn.nextInt();
        double d = b*b-4*a*c;
        if(d>0.0){
             double s1 = (-b+Math.pow(d,0.5))/(2*a);
            double s2 = (-b-Math.pow(d,0.5))/(2*a);
            System.out.println(s1);
            System.out.println(s2);
        }
        else if(d==0.0){
            double s1 = -b/(2*a);
            System.out.println(s1);
        }
        else{
            System.out.println("Roots are not real");
        }
    }
}

// Input 1 5 6 0
//Output -2.0 -3.0
