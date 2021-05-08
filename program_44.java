// Write a program to convert octal number to hexadecimal number. 


import java.util.*;
public class Main{
    public static int octal(int n){
        int ans=0;
        int d=0;
        while(n!=0){
            int r= n%10;
            ans+=r*(int)Math.pow(8,d);
            n=n/10;
            d++;
        }
        return ans;
    }
    public static String hexad(int n){
        String ans="";
        char[] hexno = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n!=0){
            int rem = n%16;
            ans = hexno[rem]+ans;
            n=n/16;
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int dec=octal(n);
        String hex=hexad(dec);
        System.out.println(hex);
    }
}

//Input : 5123
//Output : A53
