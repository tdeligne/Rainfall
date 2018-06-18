package ch08Lab1
;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * This program gathers rainfall amounts for a year.
 * It uses the Rainfall class to display the total,
 * average, highest and lowest rainfall amounts
 * @author Trevor Deligne and Hans Werner
 * 2014-11-013
 */

public class TestRainfall
{
   /**
    * Used to display the data
    * @param args
    */
   public static void main(String[] args)
   {
      final int NUMBER_OF_MONTHS = 12; // Number of months

      // Create an array to hold rainfall amounts for a year.
      double[] rainfall = new double[NUMBER_OF_MONTHS];

      // Get the week's rainfall values
      getValues(rainfall);

      // Create a Month data object, initialized
      // with the month's rainfall figures.
      Rainfall month = new Rainfall();

      // Create a DecimalFormat object.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");

      // Display the total, average, highest, and lowest
      // rainfall amounts for the months.
      JOptionPane.showMessageDialog(null,
                "The total amount of rainfall was " +
                dollar.format(month.getTotalRainfall()) +
                "\nThe average amount of rainfall was " +
                dollar.format(month.getAverageRainfall()) +
                "\nThe highest amount of rainfall was " +
                dollar.format(month.getHighestRainfallMonth()) +
                "\nThe lowest amount of rainfall was " +
                dollar.format(month.getLowestRainfallMonth()));

      System.exit(0);
   } 

   /**
      The getValues method asks the user to enter sales
      amounts for each element of an array.
      @param array The array to store the values in.
   */

   private static void getValues(double[] array)
   {
      String input;  // To hold user input.

      // Get rainfall amount for each month.
      for (int i = 0; i < array.length; i++)
      {
         input = JOptionPane.showInputDialog("Enter " +
             "the rainfall for each month: Month " + (i + 1) + ".");
         array[i] = Double.parseDouble(input);
      }
            
   }
}