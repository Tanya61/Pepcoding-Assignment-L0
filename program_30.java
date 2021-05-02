//Split number into digits. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c=0,t=n;
        while(t>0){
            c++;
            t=t/10;
        }
        c--;
        while(n>0){
            int d=n/(int)Math.pow(10,c);
            System.out.print(d+" ");
            n=n%(int)Math.pow(10,c);
            c--;
        }
    }
}

//Input 34786
//Output 3 4 7 8 6
