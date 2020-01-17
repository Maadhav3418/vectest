package com.java.basics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDifference {
	
	public void Date()
	 {

		String dateStart = "06/25/2012 09:29:58";
		String dateStop = "06/25/2019 10:31:48";

		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();
			float daysBetween = (diff / (1000*60*60*24));
			System.out.print("The Number of days Between dates is :" + daysBetween);
			/*long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);
			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds."); */

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void LeafYear()
	{
		//A leap year is exactly divisible by 4 except for century years (years ending with 00). 
		//The century year is a leap year only if it is perfectly divisible by 400.
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
	
	public void AddDates()
	{

	         Calendar c1 = Calendar.getInstance();
	        Calendar c2 = Calendar.getInstance();
	        Calendar cTotal = (Calendar) c1.clone();
	        cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
	        cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1); // Zero-based months
	        cTotal.add(Calendar.DATE, c2.get(Calendar.DATE));
	        cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
	        cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
	        cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND));
	        cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));
	        System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), cTotal.getTime());
  
	}


	public void StringToDate()
	{
   
	        // Format y-M-d or yyyy-MM-d
	        String string = "2019-06-20";
	        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
	        System.out.println("Converted String To Date is :" +date);
	 }
	
	public static void main(String[] args)
	 {
		 DateDifference dt = new DateDifference();
		 //dt.Date();
		//dt.LeafYear();
		 dt.AddDates();
		 dt.StringToDate();
	 }

}
