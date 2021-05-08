// Write a program for addition of binary numbers.


import java.util.*;
public class Main{
    public static int add_bin_nums(int a, int b){
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
        return ans;
    }
    public static int product_single(int a,int b){
        int ans=0,p=1,q=0;
        while(a!=0 || q!=0){
            int ra= a%10;
            a=a/10;
            int mul = ra*b+q;
            int r= mul%2;
            q=mul/2;
            ans+=r*p;
            p*=10;
        }
        return ans;
    }
    public static int product(int a,int b){
        int ans=0,p=1;
        while(b!=0){
            int d2=b%10;
            b=b/10;
            int n1=product_single(a,d2);
            ans=add_bin_nums(ans,n1*p);
            p*=10;
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println(product(a,b));
    }
}

//Input : 11100 10101
//Output : 1001001100
