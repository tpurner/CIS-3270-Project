
package assignment3;

import java.util.Scanner;

public class Ex6_9 {
    
    //find the min
    
    public static void main (String [] args){
        
    Scanner input = new Scanner(System.in);
    double[] array = new double[10];
    
    System.out.print("Enter 10 doubles: ");
    for (int x = 0; x < array.length; x++)
        array[x] = input.nextDouble();

    System.out.println(findMin(array) + " is the lowest number");
    } // end main 

    public static double findMin(double[] array) {
    
        double min = array[0];
    
        for (int x = 1; x < array.length; x++) {
            if (array[x] < min)
                min = array[x];
        } // end for 
      
        return min;
    } // end method
    
}
