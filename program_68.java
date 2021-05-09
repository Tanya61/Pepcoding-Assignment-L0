// WAP to compute the factors of a given number. 

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print("Factors of " + n + " are: ");
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

//Input : 60
//Output : Factors of 60 are: 1 2 3 4 5 6 10 12 15 20 30 60 
