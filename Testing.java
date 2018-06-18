package ch08Lab1;

import java.util.Scanner;

/**
 * RainFall:
 * @author Hans Werner
 * 2014-11-12
 */

public class Testing
{
     Scanner in = new Scanner(System.in);
     private int month = 12;
     private double months[ ];
     
     public Testing() 
     {
        months = new double[ 12 ];
     }
     public void setMonths() 
     {
        for (int n = 0; n < month; n++) 
        { 
             System.out.print("Enter rainfall for month "+(n+1)+" :");
             months[ n ] = in.nextInt();
             if(months[ n ]<0)
             {
                 System.out.println("Please enter positive value.");
                 n--;
             }
        }
     }
     
     public double getTotalRainfall() 
     {
        double total = 0;
        for (int i = 0; i < month; i++) 
        {
             total = total + months[ i ];
        }
        return total;
     }
     
     public double getAverageRainfall() 
     {
        return getTotalRainfall() / month;
     }
     
     public int getHighestRainFallMonth() 
     {
        double largest = months[ 0 ];
        int m=0;
        for (int i = 0; i < month; i++) 
        {
             if (months[ i ] > largest) 
             {
                 m=i;
             }
        }
        return m+1;
     }
     
     public int getLowestRainFallMonth() 
     {
        double smallest = months[ 0 ];
        int m=0;
        for (int i = 0; i < month; i++) 
        {
             if (months[ i ] < smallest)
                 m=i;
        }
        return m+1;
     }
     
     public static void main(String[ ] args) 
     {
        Testing rf = new Testing();
        rf.setMonths();
        System.out.println("The total rainfall for the year: " + rf.getTotalRainfall());
        System.out.println("The average rainfall for the year: " + rf.getAverageRainfall());
        System.out.println("The month with most rain: " + rf.getHighestRainFallMonth());
        System.out.println("The month with least rain: " + rf.getLowestRainFallMonth());
     }
}