package com.java.basics;

public class SampleProgrames {

	public void Factorial()
	{
		int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d is : %d \n ", num, factorial);
    }
	
	public void leap()
	{
		int year = 2004;
        boolean leap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if(leap)
            
        	System.out.println(year + " Is a leap year.");
        else
            System.out.println(year + " Is not a leap year.");
    
	}
	
	public void MultiplicationTable()
	{
		int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
	}
	
	public static void main(String[] args) {
		SampleProgrames sp= new SampleProgrames();
		sp.Factorial();
		//sp.leap();
		sp.MultiplicationTable();
	}

}
