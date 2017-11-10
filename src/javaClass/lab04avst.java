package javaClass;



public class lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000; //The principal or starting amount of money
        double annualRate = 4.85; //the annual rate as of percentages
        double numYears   = 30; //the number of years
        
        double monthlyRate = annualRate / 12; //THe monthly rate is equal to the the annual rate divided by the amount of months in a year (12)
        monthlyRate = monthlyRate / 100; //changing our monthly rate from a percentage to a decimal
        double numMonths = numYears * 12; // calculating the number of months by multiplying the number of years times 12 
        double monthlyPayment = ((monthlyRate * (Math.pow((1 + monthlyRate),numMonths))) / (Math.pow((1 + monthlyRate),numMonths) - 1)) * principal; //the montly payment formula
        monthlyPayment = monthlyPayment * 100; // multiply monthly payments by 100 to get the decimal
        monthlyPayment = Math.round(monthlyPayment); // Round the monthly payment down
        monthlyPayment = monthlyPayment / 100; // turn it back to what it should be
        
        
        
        double totalPayments = monthlyPayment * numMonths; //The total payments calculated by the the monthly payment times the number of months in 30 years
        totalPayments = totalPayments * 100; // Multiply monthly payments by 100 to get the decimal
        totalPayments = Math.round(totalPayments);// Round the total payment down
        totalPayments = totalPayments / 100; // turn it back to what it should be
        
        double totalInterest = totalPayments - principal; //the total interest over time
        
        double test = Math.pow(2, 3);
        System.out.println(test);
        
        
        System.out.println("Principal:          $" + principal);
        System.out.println("Annual Rate:        " + annualRate + "%");
        System.out.println("Number of years:    " + numYears);
        System.out.println("Monthly Payment:    $" + monthlyPayment);
        System.out.println("Total Interest:     $" + totalInterest);



        System.out.println();
    }
}

