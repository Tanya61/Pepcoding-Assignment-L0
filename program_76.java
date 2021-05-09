// WAP to calculate GCD of two numbers (i) with recursion (ii) without recursion.

//(i) with recursion
import java.util.*;
public class Main
{
    static int gcd(int a, int b)
    {
        if (a == 0)
          return b;
        if (b == 0)
          return a;
        if (a == b)
            return a;
      
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    
    public static void main(String args[]){    
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}
//Input : 98 56
//Output : 14


//(ii) without recursion.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int 
        div=n1,dvd=n2;
        while(dvd%div!=0){
            int rem = dvd%div;
            dvd=div;
            div=rem;
        }
        int gcd = div;

        System.out.println(gcd);
    }
}
//Input : 98 56
//Output : 14
