// WAP to calculate Factorial of a number (i)using recursion, (ii) using iteration 

//(i)using recursion
import java.util.*;
public class Main{
    public static int fact(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(fact(n));
    }
}

//Input 4
//Output 24

//(ii) using iteration 
import java.util.*;
public class Main
{
    public static void main(String args[]){    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int fact =1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    System.out.println(fact);
    }
}

//Input 4
//Output 24
