// Write a program to print ASCII value of all characters. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
             int ascii = c;
            System.out.print(ascii+" ");
        }
       
    }
}

//Input c
//Output 99
