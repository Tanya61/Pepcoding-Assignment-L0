// Write a program to convert hexadecimal number to decimal number. 


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        String hex = scn.nextLine();
        System.out.println(Integer.parseInt(hex,16));
    }
}

//Input : 1A
//Output : 26
