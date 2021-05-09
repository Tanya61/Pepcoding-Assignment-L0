// WAP to display Fibonacci series (i)using recursion, (ii) using iteration 

//(i)using recursion
import java.util.*;
public class Main
{
    static int n1=0,n2=1,n3=0;    
    static void printFibonacci(int count){    
        if(count>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            printFibonacci(count-1);    
        }    
    }    
    public static void main(String args[]){    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.print(n1+" "+n2); 
    printFibonacci(n-2);
    }  
}

//Input : 10
//Output : 0 1 1 2 3 5 8 13 21 34

//(ii) using iteration 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n==0 || n==1){
            System.out.println(n);
        }
        else{
        int a=1;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            
        }
        }
    }
}

//Input 4
//Output 1 1 2 3
