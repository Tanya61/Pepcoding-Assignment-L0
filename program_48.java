// Write a program to convert binary number to octal number. 


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        String n = scn.nextLine();
        //binary to decimal
        int dec = Integer.parseInt(n,2);
        //decimal to octal
        String oct = Integer.toOctalString(dec);
        System.out.println(oct);
    }
}

//Input : 1010
//Output : 12
