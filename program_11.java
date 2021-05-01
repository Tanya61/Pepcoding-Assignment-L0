// Write a program for Floyd’s triangle. 
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int v=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(v+" ");
                v++;
            }
            System.out.println();
        }
    }
}

//Input 4
//Output :
//1
//2 3
//4 5 6
//7 8 9 10
