//Program to find largest of n numbers.

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

// Input : 5
// 5 4 8 9 3
//Output : 9
