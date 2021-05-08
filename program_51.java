// Write a program for addition of binary numbers.


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=0,ans=0,p=1;
        while(a>0 || b>0 || c>0){
            int ra=a%10;
            int rb=b%10;
            a=a/10;
            b=b/10;
            int s=ra+rb+c;
            int q=s/2;
            int r=s%2;
            c=q;
            ans+=r*p;
            p*=10;
        }
        System.out.println(ans);
    }
}

//Input : 11100
//        10101
//Output : 110001
