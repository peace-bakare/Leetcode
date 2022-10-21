//1304. Find N Unique Integers Sum up to Zero
/*
 * Given an integer n, return any array containing n unique integers such that they add up to 0. * 
*/


import java.util.*;

public class Q1304 {
    public static int [] sumZero(int n) {
        int [] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = i * 2 - n + 1;
        }
        return res;
    }
    
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items that should be in the array: ");
        int n = input.nextInt();   
        input.close(); 
        System.out.println("The numbers are: " + sumZero(n));
    }
}