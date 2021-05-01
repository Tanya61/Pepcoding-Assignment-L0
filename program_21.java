// Write a program to find largest among three numbers using binary minus operator. 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(a-b>0 && a-c>0){
            System.out.println(a);
        }
        else if(b-c>0){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
        
    }
}

//Input 7 8 5
//Output 8
