 //Write a program to check given number is prime number or not. 
 import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                t++;
            }
        }
        if(t==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

//Input 17
//Output true

//Input 18
//Output false
