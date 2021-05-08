//Write a program to convert binary number to hexadecimal number.


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        String n = scn.nextLine();
        //binary to decimal
        int dec = Integer.parseInt(n,2);
        String hexa = Integer.toHexString(dec);
        System.out.println(hexa);
    }
}

//Input : 0101
//Output : a
