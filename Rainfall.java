package ch08Lab1;

/**
* This program uses an array and methods to 
* get info about amount of rainfall per month
* and displays information about the entered date
* @author Trevor Deligne and Hans Werner
* 2014-11-013
*/
 

public class Rainfall
{
  
    public static final int NUMBER_OF_MONTHS = 12;                  /*max
                                                                      months*/
    private double[] rainFallAmount = new double[NUMBER_OF_MONTHS]; /*set
                                                                      array*/
    /**
     * no arg constructor
     * uses default constructor
     */
    public Rainfall()
    {
      
    }
    
    /**
     * The setRainfall method stores a value in the 
     * name month and amt fields, and validates input
     * @param n The value stored in name.
     */
    public void setRainfall(int month, double amt)
    {
      if (month > 0 && month < 13)
      {
        if (amt > 0)
        {
          
          rainFallAmount[month - 1] = amt;
        }
      }
    }
    
    /**
     * getRainfall method
     * @return The amount of rainfall
     */
    public double getRainfall(int month)
    {
      
      return rainFallAmount[month - 1];
    }
    
    /**
     * getAverageRainfall method
     * @return The calculated average rainfall 
     */
    public double getAverageRainfall()
    {
      return  getTotalRainfall() / NUMBER_OF_MONTHS;
    }
    
    /**
     * getTotalRainfall method
     * @return The total amount of rainfall
     * for all the months
     */
    public double getTotalRainfall()
    {
      double total = 0;
      for ( int i = 0; i < NUMBER_OF_MONTHS; i++ )
      {
        total += rainFallAmount[i];
      }
      return total;
    }
    
    /**
     * getHighestRainfallMonth method
     * @return The highest amount of rainfall
     * given by the user
     */
    public int getHighestRainfallMonth()
    {
      int highest_rain = 0;
      for ( int i = 0; i < NUMBER_OF_MONTHS; i++ )
      {
        if ( rainFallAmount[i] > rainFallAmount[highest_rain] )
          highest_rain = i;
      }
      return  highest_rain + 1;
    }
    
    /**
     * getLowestRainfallMonth method
     * @return The lowest amount of rainfall
     * given by the user
     */
    public int getLowestRainfallMonth()
    {
      int lowest_rain = 0;
      for ( int i = 0; i < NUMBER_OF_MONTHS; i++ )
      {
        if ( rainFallAmount[i] < rainFallAmount[lowest_rain] )
          lowest_rain = i;
      }
      return  lowest_rain + 1;
    }
}
