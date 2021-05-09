// WAP to print the sum and product of digits of an integer. 


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=0,product =1;
        while(n!=0){
            int d= n%10;
            sum+=d;
            product*=d;
            n=n/10;
        }
        System.out.println("Sum : "+sum);
        System.out.println("Product : "+product);
    }
}

//Input : 1234
/*Output -
          Sum : 10
          Product : 24
*/          
