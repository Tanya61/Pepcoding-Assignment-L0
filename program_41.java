// Write a program to convert decimal number to  hexadecimal number.

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String ans="";
        char[] hexno = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n!=0){
            int rem = n%16;
            ans = hexno[rem]+ans;
            n=n/16;
        }
        System.out.println(ans);
    }
}

//Input: 159
//Output: 9F
