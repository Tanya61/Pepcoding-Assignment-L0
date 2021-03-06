/*WAP to print a triangle of stars as follows (take number of lines from user): 
     * 
   *** 
  ***** 
 ******* 
********* 
*/


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Input : 5
/*Output :    
     * 
    * * 
   * * * 
  * * * * 
 * * * * *
 */
