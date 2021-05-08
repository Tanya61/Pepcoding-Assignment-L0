// Write a program to convert hexadecimal number to binary number. 


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        String hex = scn.nextLine();
        int dec=Integer.parseInt(hex,16);
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);
    }
}

//Input : 1AC5
//Output : 1101011000101
