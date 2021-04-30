 //Write a program to check given string is palindrome number or not. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int i=0,j=s.length()-1;
        while(i<j){
            char f = s.charAt(i);
            char l = s.charAt(j);
            if(f!=l){
                System.out.println(false);
                return;
            }
            i++;
            j--;
        }
        System.out.println(true);
    }
}

//Input abcd
//Output false

//Input abba
//Output true
