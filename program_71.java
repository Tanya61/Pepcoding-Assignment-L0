/*
71.  WAP to perform following actions on an array entered by the user: 
i) Print the even-valued elements 
ii) Print the odd-valued elements 
iii) Calculate and print the sum and average of the elements of array 
iv) Print the maximum and minimum element of array 
v) Remove the duplicates from the array 
vi) Print the array in reverse order 
The program should present a menu to the user and ask for one of the options. The menu should also include options to re-enter array and to quit the program. 
*/

import java.util.*;

public class Main{
    
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        choice();
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i)
        {
            a[i]=scn.nextInt();
        }
        
        
        while(true)
        {
        System.out.println("Enter Your Choice");
        int c = scn.nextInt();
        if(c==8)
        {
            n = scn.nextInt();
            for(int i=0;i<n;++i)
            {
            a[i]=scn.nextInt();
            }
            
        }
        else
        {
        menu(a,c);
        }
        System.out.println("Want to Quit press 0");
        if(scn.nextInt()==0)
        {
            break;
        }
        }
        
    }
    
    public static void choice()
    {
        System.out.println("To Print the even-valued elements press 2");
        System.out.println("To Print the odd-valued elements press 3");
        System.out.println("To Calculate and print the sum and average of the elements of array press 4");
        System.out.println("To Print the maximum and minimum element of array press 5");
        System.out.println("To Remove the duplicates from the array press 6");
        System.out.println("To Print the array in reverse order press 7");
        System.out.println("To enter array press 8");
    }
    
    public static void menu(int[] a,int n)
    {
        
        switch(n)
        {
        
            case 2 : even(a);
                   break;
            case 3 : odd(a);
                   break;
            case 4 :SA(a);
                break;
            case 5 :MM(a);
                break;
            case 6 : RemoveD(a);
                break;
            case 7 : print(a);
                break;
            case 8 : break;
            default : System.out.println("Please Enter Valid Input ");
        }
     
        
        
    }
     public static void print(int[] a)
    {
        
        for(int i=a.length-1;i>=0;--i)
        {
            System.out.print(a[i]+" ");
        }
        
        System.out.println();
        
        
    }
    
    public static void RemoveD(int[] a)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<a.length;++i)
        {
            if(hm.containsKey(a[i]))
            {
                
            }
            else
            {
                hm.put(a[i],1);
            al.add(a[i]);
            }
        }
        System.out.println(al);
        
    }
    public static void even(int[] a)
    {
        System.out.print("Even valued elements -> ");
        for(int i=0;i<a.length;++i)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
    public static void MM(int[] a)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;++i)
        {
            max = Math.max(max,a[i]);
            min = Math.min(min,a[i]);
        }
        System.out.println("Maximum -> "+ max);
        System.out.println("Minimum -> "+ min);
    }
    public static void odd(int[] a)
    {
        System.out.print("odd valued elements -> ");
        for(int i=0;i<a.length;++i)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
    public static void SA(int[] a)
    {
        
        int s=0;
        double avg=0;
        for(int i=0;i<a.length;++i)
        {
            s=s+a[i];
        }
        avg = s/a.length;
        System.out.println("sum of elements -> " + s);
        System.out.println("average of elements -> "+ avg);
    }
}   

/*
input : 
6
1 2 3 4 5 5
2
1
3
1
4
1
5
1
6
1
7
1
8
4
1 2 3 4 
0
output :
To Print the even-valued elements press 2
To Print the odd-valued elements press 3
To Calculate and print the sum and average of the elements of array press 4
To Print the maximum and minimum element of array press 5
To Remove the duplicates from the array press 6
To Print the array in reverse order press 7
To enter array press 8
Enter Your Choice
Even valued elements -> 2 4 
Want to Quit press 0
Enter Your Choice
odd valued elements -> 1 3 5 5 
Want to Quit press 0
Enter Your Choice
sum of elements -> 20
average of elements -> 3.0
Want to Quit press 0
Enter Your Choice
Maximum -> 5
Minimum -> 1
Want to Quit press 0
Enter Your Choice
[1, 2, 3, 4, 5]
Want to Quit press 0
Enter Your Choice
5 5 4 3 2 1 
Want to Quit press 0
Enter Your Choice
Want to Quit press 0
*/

