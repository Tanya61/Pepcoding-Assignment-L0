//  Write a program to convert binary number to decimal number. 


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        String n = scn.nextLine();
        //binary to decimal
        int dec = Integer.parseInt(n,2);
        System.out.println(dec);
    }
}

//Input : 1010
//Output : 10
