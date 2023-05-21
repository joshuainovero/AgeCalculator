// DISCLAIMER: The following code is open source and I do not claim ownership over it.
// Author: Lokesh Gupta
// Source: https://howtodoinjava.com/java/calculate-age-from-date-of-birth/

package MP5.vendor;

public class Age
{
   private int days;
   private int months;
   private int years;

   public Age(int days, int months, int years)
   {
      this.days = days;
      this.months = months;
      this.years = years;
   }

   public int getDays()
   {
      return this.days;
   }

   public int getMonths()
   {
      return this.months;
   }

   public int getYears()
   {
      return this.years;
   }

   @Override
   public String toString()
   {
      return years + " Years, " + months + " Months, " + days + " Days";
   }
}