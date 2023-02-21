public class Worker extends Person{

    Double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, Double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }


    //Methods//
    double calculateWeeklyPay(double hoursWorked)
    {
        Double Regular;
        Double OverTime;

        if (hoursWorked > 40)
        {
            Regular =  hoursWorked * hourlyPayRate;
            OverTime = (hoursWorked - 40) * hourlyPayRate * 1.5;
            hoursWorked = 40;

            return OverTime + Regular;

        }
        else
        {
            Regular =  hoursWorked * hourlyPayRate;
            return Regular;

        }
    }



    ////DisplayWeeklyPay///

   public String displayWeeklyPay(double hoursWorked)
   {
       if (hoursWorked > 40)
       {
           System.out.println("Regular Hours: 40.0");
           System.out.println("Total Regular Pay:$ " +   hoursWorked * hourlyPayRate);
           System.out.println("OverTime Hours:" +(hoursWorked - 40));
           System.out.println("OverTime Pay:$ " + (hoursWorked - 40) * (hourlyPayRate * 1.5));
           System.out.println("Total Pay:$ " + calculateWeeklyPay(hoursWorked));
       }
       else
       {
           System.out.println("Hours of regular pay: " + hoursWorked);
           System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
       }

       return "";

   }


}


