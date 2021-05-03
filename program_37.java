//Write a program for swapping of two arrays. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[]= new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= scn.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]= scn.nextInt();
        }
        System.out.print("Before swapping array 1 is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("Before swapping array 2 is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int t= arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=t;
        }
        System.out.print("After swapping array 1 is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("After swapping array 2 is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
/*
Input: 5
       1 2 3 4 5
       6 7 8 9 0

Output : 
Before swapping array 1 is : 1 2 3 4 5 
Before swapping array 2 is : 6 7 8 9 0 
After swapping array 1 is : 6 7 8 9 0 
After swapping array 2 is : 1 2 3 4 5 
*/
