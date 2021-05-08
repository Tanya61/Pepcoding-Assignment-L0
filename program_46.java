// Write a program to convert hexadecimal number to octal number.

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        String hex = scn.nextLine();
        int dec=Integer.parseInt(hex,16);
        int oct=0,d=0;
        while(dec!=0){
            int r= dec%8;
            oct+=r*(int)Math.pow(10,d);
            d++;
            dec/=8;
        }
        System.out.println(oct);
        
    }
}

//Input : 5D1F
//Output : 56437
