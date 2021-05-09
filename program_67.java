// Write a function to find whether a given no. is prime or not. Use the same to generate the prime numbers less than 100. 

import java.util.*;
public class Main{
    public static boolean prime(int n){
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        for(int i=2;i<100;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
}

//Output : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97  
