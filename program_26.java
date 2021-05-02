// convert string to int without using library functions. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int p=(int)Math.pow(10,str.length()-1);
        int res = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int a= c-48;
            res = res+a*p;
            p=p/10;
        }
        System.out.println(res);
    }
}

//Input 7854
//Output 7854
