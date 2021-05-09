// Write a program to print Pascal triangle. 
//[ Input : a number , output : pascal’s triangle pattern ] 

import java.util.*;
 
public class Main {
    public static void printPascal(int n)
    {
        for (int line = 0; line < n; line++)
        {
            for (int i = 0; i <= line; i++)
            System.out.print(binomialCoeff(line, i)+" ");
                         
            System.out.println();
        }
    }
    static int binomialCoeff(int n, int k)
    {
        int res = 1;
         
        if (k > n - k)
        k = n - k;
             
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPascal(n);
    }
}

//Input : 7
/* Output :
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 
1 6 15 20 15 6 1 
*/
