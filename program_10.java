 //Write a program to get factorial of given number. 

import java.util.*;
public class Main{
    public static int fact(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(fact(n));
    }
}

//Input 4
//Output 24
