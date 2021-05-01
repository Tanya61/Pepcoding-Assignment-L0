// Write a program to find out power of number.   

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        int ans = (int)Math.pow(n,p);
        System.out.println(ans);
    }
}

//Input 3 4
//Output 81
