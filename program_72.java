//  Write a program which takes the radius of a circle as input from the user, passes it to another function that computes the area and the circumference of the circle and displays the value of area and circumference from the main() function. 

import java.util.*;
public class Main{
    public static double Area(int r){
        return (22*r*r)/7;
    }
    public static double Circum(int r){
        return (2*22*r)/7;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int r= scn.nextInt();
        System.out.println(Area(r));
        System.out.println(Circum(r));
    }
}

//Input : 7
//Output : 154.0
//         44.0
